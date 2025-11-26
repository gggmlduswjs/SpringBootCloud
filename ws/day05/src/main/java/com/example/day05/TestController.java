package com.example.day05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @Autowired
    TestService service;

    @GetMapping("/test")
    public String test(){
        return  "testView";
    }

    //loginTest?str=HELLO
    @GetMapping("/loginTest")
    public  String test2(@RequestParam( name="str" ,required = false)  String str  , Model model)  {
        String result  =service.getLowerString( str);
        model.addAttribute("result" , result);
        return  "testView2";
    }


}
