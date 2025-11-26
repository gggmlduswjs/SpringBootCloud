package com.example.day05;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice
public class GlobalCatcher {

    @ExceptionHandler(SQLException.class)
    public String catcher(Model model, SQLException ex){
        model.addAttribute("ex",ex);
        return  "gErr";
    }

    @ExceptionHandler(잔액부족예외상황.class)
    public String catcher2(Model model, 잔액부족예외상황 ex){
        model.addAttribute("ex",ex);
        return  "gErrMoney";
    }
}
