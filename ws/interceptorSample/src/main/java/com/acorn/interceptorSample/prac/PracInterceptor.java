package com.acorn.interceptorSample.prac;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class PracInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestUrl = request.getRequestURI();
        System.out.println(requestUrl);
        System.out.println(request.getMethod());
        System.out.println("prac preHandle ho");

        request.setAttribute("num",1000);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);

        System.out.println("postHandle ^^- 오류가 발생하면 실행되지 않는다");
        //공통모델 심기
        modelAndView.addObject("data","prac postHandle 공통 모델 심기");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);

        System.out.println("bye ^^ prec afterCompletion");


        int result=(int)request.getAttribute("num");

        System.out.println(result);
    }
}
