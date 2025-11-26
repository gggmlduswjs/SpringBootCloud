package com.example.uploadEx.prac;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MyUploadController {



    //화면

    @GetMapping("/myUpload")
    public  String  myUploadForm(){
        return  "myUploadForm";
    }


    //실제업로드

    @PostMapping("/myUpload")
    public String  myUpload(
          @RequestParam( name="title") String title,
          @RequestParam( name="file")   MultipartFile file
    ){
        //

        System.out.println( "title" + title);
        System.out.println( "file" + file);
        System.out.println( file.getOriginalFilename());
        //file.transferTo();
        return "myUploadok";
    }


}
