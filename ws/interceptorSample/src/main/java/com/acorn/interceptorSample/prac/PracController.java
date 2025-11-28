package com.acorn.interceptorSample.prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//
 // controller 요청하기 전 공통작업 preHandle
// controller ModelAndView 반환할 때 postHandle
// 타임리프 뷰렌더링 후 afterCompletion

// preHandle "hi prac preHandle" - request 저장소로 사용할 수 있음
// postHandle : 모델을 심기 (공통 모델 심기) data -  "postHandle model 심기"
// afterCompletion : "bye prac afterCompletion"




@Controller
public class PracController {

    @GetMapping("/prac1")
    public String method1(){
        return "prac1View";
    }

    @GetMapping("/prac2")
    public String method2(){
        return "prac2View";
    }


}
