package com.example.day07.login;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

// 인터셉터 : mvc에서 공통작업들을 처리할 때 사용됨

// preHandle    : 요청 전에 호출됨 (로그인 확인)
// postHandle   : 
// afterCompletion

public class MySessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        return HandlerInterceptor.super.preHandle(request, response, handler);

        System.out.println("preHandle^^");

        HttpSession session= request.getSession( false); // 없으면 null 반환

        if(session == null || session.getAttribute("userId")==null){
            response.sendRedirect(request.getContextPath()+"/loginForm");

            return false;   // true : 정상적인 요청 흐름으로 진행, false : 흐름이 중단
        }


        return  true;   //true : 정상적인 요청흐름으로 진행, false:흐름이 중단됨
    }
}
