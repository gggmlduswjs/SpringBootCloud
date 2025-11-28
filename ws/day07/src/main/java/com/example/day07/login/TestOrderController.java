package com.example.day07.login;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestOrderController {

    //
    @GetMapping("/test/Order")
    public String orderTest(HttpServletRequest request) {


//        HttpSession session=request.getSession(false);  // 없으면 null 반환
//        //로그인에 성공못한 사람
//        if(session==null || session.getAttribute("userId")==null){
//
//            return "redirect:/loginForm";
//        }


        return "orderView";
    }
}
