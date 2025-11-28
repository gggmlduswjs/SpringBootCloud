package com.example.day07;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class HomeController {

    // 메인화면
    @GetMapping("/home")
    String home(HttpServletRequest request, HttpServletResponse response){


        //쿠키가 없는 경우 쿠기 만들어서 응답( 쿠기심기) -> request 객체에서 꺼내옴

        //쿠기가 있는 경우 쿠기 값을 이용해서 연령대에 대한 뷰 응답

        Cookie[] cookies =request.getCookies();
        String age=null;

        //cookies 정보 null처리, 쿠키가 없는 경우는 null 반환

        if(cookies != null){

            for( Cookie cookie : cookies){ // key : value

                if("age".equals(cookie.getName())){ //age key 찾기

                    age=cookie.getValue();
                    break;

                }

            }
        }
        
        //age 쿠기가 있는 경우 => age 쿠기 심기, 응답하기, 기본 뷰 응답
        //age 쿠기가 없는 경우 => age 쿠기의 값을 이용해서 나이에 맞는 뷰를 응답하기

        if(age==null) {

            // 쿠키 만들기
            //쿠키 심기
            //사용자의 나이를 데이터베이스에서 가져옴
            age="25";
            Cookie ageCookie = new Cookie("age",age);   // age:25
            ageCookie.setMaxAge(60*60*24*365);
            ageCookie.setPath("/"); //path => / 모든 요청에 쿠키가 전달된다
            // ageCookie.setPath("/admin") : /admin 요청할 때만 쿠기가 전달된다 (클라이언트 -> 서버측)

            // 쿠키 응답하기
            response.addCookie(ageCookie);
            return  "home";
        }

        // 쿠키가 있는 경우
        int ageInt = Integer.parseInt(age); //"30"=>30

        if(ageInt >= 20 && ageInt <30){
            return "view20";
        }else if(ageInt >=30 && ageInt <40){
            return "view30";
        }else if(ageInt >=40 && ageInt<50){
            return "view40";
        } else if(ageInt >=50 && ageInt<60){
            return "view50";
        }else {
            return "home";
        }


    }
}
