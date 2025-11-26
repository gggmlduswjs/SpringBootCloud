package com.acorn.ExceptionSample;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class TestController {


    @PostMapping("/test")
    public  String  test(){
        return  "test";
    }

}
