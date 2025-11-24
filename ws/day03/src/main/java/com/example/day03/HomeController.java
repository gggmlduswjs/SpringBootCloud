package com.example.day03;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// view 반환
@Controller
public class HomeController {

    @GetMapping("/home")
    public String main() {
        return "main";
    }

}
