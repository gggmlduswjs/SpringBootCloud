package com.example.uploadEx.prac;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.UUID;

@Controller
public class MyUploadController {

    String fileDir = "C:/upload/";

    @GetMapping("/myUpload")
    public String myUploadForm() {
        return "myUploadForm";
    }

    // 실제 업로드 처리
    @PostMapping("/myUpload")
    public String myUpload(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "file") MultipartFile file,
            Model model
    ) throws IOException {

        System.out.println("title = " + title);
        String originName = file.getOriginalFilename();
        System.out.println("file name = " + file.getOriginalFilename());
        System.out.println(file.getOriginalFilename());
        //file.transferTo();
        String uuid= UUID.randomUUID().toString();
        System.out.println(uuid);

        int index = originName.lastIndexOf(".");
        System.out.println(index);
        String 확장자 =originName.substring(index+1);
        String saveName=uuid+"."+확장자; //
        System.out.println(saveName);

        ;  // 반드시 실제 폴더 존재해야 함
        String pullPath=fileDir+saveName;


        file.transferTo(new File(pullPath));
    
        //데이터베이스 저장 호출

        // 모델 객체에 이미지 정보 저장하기
        model.addAttribute("fileName", saveName);
        // 이미지 보여주기
        return "myUploadok";



    }

    
    //pathvariable에 . 이 있는 경우 .점 뒤에 무시될 수 있음
    //이미지보여주기
    @GetMapping("/myimages/{fileName:.*}")
    public ResponseEntity<Resource>  getImage(@PathVariable String fileName) throws MalformedURLException {

        System.out.println( "이미지보여주기" + fileName);  //dkfdjlkdjfdkfjdkfd-dkdfk.png
        Resource  resource = new UrlResource("file:"+fileDir+fileName);
        return  ResponseEntity.ok().body(resource);
    }

    @GetMapping( value="/attach/{fileName:.*}")
    public ResponseEntity<Resource> fileDownload(@PathVariable(name="fileName") String  fileName) throws MalformedURLException, UnsupportedEncodingException, UnsupportedEncodingException, UnsupportedEncodingException {

        //서버의 리소스(자원)을 제공할 때 사용
        Resource  resource=  new  UrlResource("file:c:\\test\\upload\\"+ fileName);
        //파일이름이 한글문제로  encode작업함
        String encodedUploadFileName = URLEncoder.encode(fileName, "UTF-8");
        //응답헤더정보에 attachment라는 정보제공해야함(다운로드가 성공한다)
        String contentDispositon = "attachment; filename=\""+ encodedUploadFileName + "\"";
        return   ResponseEntity.ok()
                .header( HttpHeaders.CONTENT_DISPOSITION, contentDispositon)
                .body(resource);

    }

}
