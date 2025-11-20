package com.acorn.day01Hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {


    @GetMapping("/calcForm")
    public  String  taksk1Form( ){
        return  "task1Form";
    }


    //   두 수 더한 값을 반환 하는 문제
    //   Task1Service

    @GetMapping("/calc")
      public  String  taksk1(
            @RequestParam ( name="su1" , required = false , defaultValue = "1") int su1,
            @RequestParam(  name="su2",   required = false, defaultValue = "1") int su2 , Model model ){


          int result  = su1+su2;
          System.out.println( result);
          model.addAttribute("result", result);
          return  "task1";
      }

}
