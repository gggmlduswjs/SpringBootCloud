package com.acorn.sessionSample;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController2 {



   @RequestMapping("/list")
   public String list( HttpServletRequest request) {

       HttpSession session  = request.getSession(false);   //
       if (session == null ||  session.getAttribute("userId") == null) {
           return "redirect:/login/login";
       }

     return "boardList"  ;   
  }


}