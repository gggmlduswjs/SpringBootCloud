package com.example.helloday01;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Task6Controller {

    @Autowired
    Task6Service service;

    // 약수구하는 화면 응답
    @GetMapping("/divisorForm")
    public  String divisorForm(){
        return  "task6View";
    }

     // 특정수에 대한  약수를 응답    //
    @PostMapping("/divisorResult")
    public  String divisorResult(
            @RequestParam( name="su"  , required = false , defaultValue = "1") int su,
            Model model
    ){
        System.out.println( su);
        //su=> 약수를 응답   ( 1,2,3,4,6,12)
        //String result  =" 1,2,3,4,6,12";
        String result="";
        result = service.getDivisor(su);
        model.addAttribute("result" , result);
        return "task6ResultView";  // return "redirect:/home"  => 재요청 , response.sendRedirect("/home");
    }


}
