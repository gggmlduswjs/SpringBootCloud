package com.example.day05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @Autowired
    TestService service;

    @GetMapping("/method1")
    public String method1요청(){

        try{
            //String result = service.getLowerString("Hello");
            String result = service.getLowerString(null);
            return  "view1";

        }catch (Exception e){
            return "view1Error";
        }


    }
}
