package com.example.day07.login;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testBoardController {

    @GetMapping("/test/Board")
    public String board(HttpSession session){
        
        
        // 로그인 확인하기 로그인 체크하기
        // check - 세션저장소 확인

//        if(session.getAttribute("userId")==null){
//            return  "redirect:/loginForm";
//        }


        return "boardForm";
    }
}
