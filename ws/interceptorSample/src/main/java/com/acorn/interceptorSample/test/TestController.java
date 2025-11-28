package com.acorn.interceptorSample.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @Autowired
    MemberService service;


    @ResponseBody
    @GetMapping("/test")
    public String test(){
        service.hello();
        return  "test";
    }
}
