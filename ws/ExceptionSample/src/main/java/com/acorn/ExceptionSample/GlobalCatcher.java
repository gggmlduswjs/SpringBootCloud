package com.acorn.ExceptionSample;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


//@ControllerAdvice(basePackages = "com.acorn.ExceptionSample")
 //@ControllerAdvice
public class GlobalCatcher {


     // @ResponseStatus  =>상태정보 변경하기
    // 예외를 서버가 처리하게 되면 상태정보는 정상 200 성공으로 설정된다
    // 예외처리시 상태정보 변경이 필요하다
	 @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
	 @ExceptionHandler(Exception.class)
	public String catcher( Model model, Exception ex ) {		 			 
		  model.addAttribute("ex", ex);
		  return "gErr";
	}

}
