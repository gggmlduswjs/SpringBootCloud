package com.example.day05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

@Controller
public class MyController2 {
    
    // Controller내에서 발생하는 Exception에 대해서 일괄적으로 처리하기
    // ExceptionHandler 사용하기

    //SQLException 예외를 일괄적으로 처리한다
//    @ExceptionHandler(SQLException.class)
    public String catcher1(Model model,SQLException ex){
        model.addAttribute("ex",ex);
        return "dbErr";
    }

    @ExceptionHandler(Exception.class)
    public String catcher2(Model model, NullPointerException ex) {
        model.addAttribute("ex", ex);
        return "nullErr";
    }

    
    //요청
    @GetMapping("/ex1")
    public void method1() throws Exception {
        throw new Exception();

    }



    
    //요청
    @GetMapping("/ex2")
    public void method2() throws SQLException {
        throw new SQLException();
    }
    
    //요청
    @GetMapping("/ex3")
    public void method3(){
        throw new NullPointerException();
    }

    @GetMapping("/ex4")
    public void method4() throws SQLException {
        throw new SQLException();
    }


    @GetMapping("/ex5")
    public void method5() throws 잔액부족예외상황 {
        throw new 잔액부족예외상황();
    }



}
