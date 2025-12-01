package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class LogAspect {

    //  Service 패키지 아래 모든 메서드 실행 전후
    //@Around("execution(* com.example.aop.TestService.*(..))")    //특정클래스 지정
    @Around("execution(* com.example.aop..*(..))")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("▶ 메서드 시작: " + joinPoint.getSignature());

        Object result = joinPoint.proceed(); // 실제 메서드 실행

        System.out.println("▶ 메서드 종료: " + joinPoint.getSignature());

        return result;
    }
}
