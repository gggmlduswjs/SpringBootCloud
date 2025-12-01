package com.example.aop.prac;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PracController {

    @ResponseBody
    @GetMapping("/prac1")
    public String prac1(){

        return "prac1";
    }
}
