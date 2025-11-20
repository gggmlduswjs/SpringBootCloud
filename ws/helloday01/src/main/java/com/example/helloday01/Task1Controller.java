package com.example.helloday01;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Task1Controller {

    @Autowired
    Task1Service task1Service;

    //매서드 단위 매핑
    //Get, Post

    //계산기 화면 요청 매핑(Get)
    @GetMapping("/calcForm")
    public String clacForm(){
        return "task1View";
    }

    // calc?su1=5&su2=7

    // 계산기 처리 요청 매핑(Post)
    @PostMapping("/calc")
    public String calc(
            @RequestParam(name="su1", required = false,defaultValue = "1") int su1,
            @RequestParam(name="su2",required = false,defaultValue = "1") int su2,
            Model model
    ){
        
        //처리
//       // int result=su1+su2; =>서비스 층으로 분리함
        //결과 모델에 저장

//        int result=0;

        int result = task1Service.addNumber(su1, su2);

        model.addAttribute("result",result);


        
        return "task1ResultView";
    }
}
