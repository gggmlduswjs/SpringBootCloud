package com.example.aop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    MyService service;

    //생성자 주입

    @Autowired
    public MyController(MyService service){
        this.service=service;
    }

    @ResponseBody
    @GetMapping("/add")
    public String add(
            @RequestParam(value = "su1",required = false,defaultValue = "1") int su1,
            @RequestParam(value = "su2",required = false,defaultValue = "1") int su2
    ){
        int result=service.add(su1,su2);


        model.add
        return "calResult";
    }
}
