package com.example.helloSpring;

import com.example.helloSpring.model.Cook;
import com.example.helloSpring.model.CookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CookController {

    @Autowired
    private CookService cookService;

    // 오늘의 요리사 JSON 반환
    @GetMapping("/today-cook")
    public String  getTodayCook(   Model model) {
          Cook cook   =cookService.getCookName();
         model.addAttribute("cook"  , cook);
         return "cookFinal";
    }
}
