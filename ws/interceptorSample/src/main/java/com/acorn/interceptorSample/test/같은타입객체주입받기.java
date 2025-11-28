package com.acorn.interceptorSample.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class 같은타입객체주입받기 {


    @Autowired
    @Qualifier("apple")   // Bean 이름을 명시
    Furit test;

}


/*
 같은타입의 객체를 여러개 생성할 때는 이름을 명시해야 함   - 하지않으면  confilt 남
 같은타입의 객체를 주입 받을 때는  Qualifier 명시해야 함  (빈이름 명시)



 */

