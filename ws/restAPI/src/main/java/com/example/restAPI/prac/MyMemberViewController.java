package com.example.restAPI.prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyMemberViewController {

    @GetMapping("/myView")
    public String view() {
        return "myView";
    }
}
