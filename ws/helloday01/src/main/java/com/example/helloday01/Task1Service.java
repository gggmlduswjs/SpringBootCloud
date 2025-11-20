package com.example.helloday01;

import org.springframework.stereotype.Service;
// @Component(객체생성, @Service, @Rerpository => 의미적 구분의 이름)
@Service
public class Task1Service {

    // 두 수의 합을 제공
    public int addNumber(int su1,int su2){
        return su1+su2;
    }


}


