package com.acorn.sessionSample.cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping("/orderTest")
    public  String  orderView(  @CookieValue(name = "age", required = false  ,defaultValue = "") String age){

        System.out.print( "쿠키="+ age);
        return "orderView";
    }

}
