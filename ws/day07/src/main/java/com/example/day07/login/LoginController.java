package com.example.day07.login;

// 아이디 기억하기 쿠키 사용

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // 로그인 화면
    @GetMapping("/loginForm")
    public  String loginForm(@CookieValue(value = "id"  ,required = false, defaultValue = "") String id ,
                             Model model){

        model.addAttribute("id", id);  //쿠키정보를  뷰에서 사용하도록 모델에 저장하기
        return "loginForm";
    }

    // 로그인 처리
    @PostMapping("/login")
    public String loginProc(
            @RequestParam("id") String id,
            @RequestParam("pw") String pw,
            @RequestParam(value = "remId", defaultValue = "false")boolean remId,        // checkbox 값이 있으면 true, 없으면 false

            HttpServletResponse response,
            HttpServletRequest request

    ) {
        
        System.out.println(id);
        System.out.println(pw); //로그인 성공 acorn 1234 성공
        System.out.println(remId); // 아이디 기억하기

        // 간단하게 로그인 체크 로직
        boolean result=false;
        if("acorn".equals(id) && "1234".equals(pw)){
            result=true;    //로그인 성공
        }
        
        // 로그인 성공 후    //세션에 로그인정보 저장하기
//        if(result==true){
        if(result){ //로그인 성공
            // 로그인 정보 세션에 저장하기
            //
            HttpSession session=request.getSession();
            session.setAttribute("userId", id);
        
        }else { //로그인 실패

            return  "loginForm";
            
        }
        
        
        
        if(remId){
            
            //아이디 기억하기
            //쿠키 만들고 등록하기
            Cookie cookie = new Cookie("id",id);
            cookie.setPath("/");
            cookie.setMaxAge(60*60*24*30);  // 쿠키의 유효기간 설정 30일
            //
             // response 객체에 쿠키 심기
            response.addCookie(cookie);
            
        }else {
            //아이디 기억안하기
            // 쿠기 삭제(똑같은 이름의 쿠키를 만들고 setMaxAge(0)
            Cookie cookie = new Cookie("id","");
            cookie.setPath("/");
            cookie.setMaxAge(0); //쿠키 삭제하기
            response.addCookie(cookie);
            
        }
        
        
        
        return  "redirect:/home";   // response.sendRedirect() 브라우저에게 재요청(/home)
    }

    @GetMapping("logOut")
    public String logOut(HttpServletRequest request){

        HttpSession session= request.getSession(false); //자신이 얻은 세션정보 가져오기 없었다면 null 반환

        if(session != null){
            session.invalidate();   //
//            session.removeAttribute("userId");
        }


        return "redirect:/home";
    }
}
