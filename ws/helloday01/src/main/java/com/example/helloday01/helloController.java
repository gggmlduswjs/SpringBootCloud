package com.example.helloday01;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class helloController {

    // 매서드 매핑

    //view응답(void,String,ModelAndView)


    @GetMapping("/hi")
    public String hi(Model model){

        //모델 저장하기
        String data="hello spring model ^^";
        model.addAttribute("data",data);
        return  "hi";
    }


    // view응답- 모델 - 리스트 심기
    
    @GetMapping("/hi2")
    public String hi2(Model model){

        //리스트 만들기

        List<String> list = new ArrayList<>();
        list.add("카푸치노");
        list.add("아메리카노");
        list.add("꿀라떼");

        //

        model.addAttribute("list",list);



        return "hi2";
    }
}
