package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect2 {

    //   공통 포인트컷: com.example.aop 패키지의 모든 메서드
    @Pointcut("execution(* com.example.aop..*(..))")
    public void allAopMethods() {}

    // -----------------------------------------
    // 1) 실행 전 (@Before)
    // -----------------------------------------
    @Before("allAopMethods()")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("▶ BEFORE: " + joinPoint.getSignature());
    }

    // -----------------------------------------
    // 2) 정상 반환 후 (@AfterReturning)
    // -----------------------------------------
    @AfterReturning(value = "allAopMethods()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("▶ RETURNING: " + joinPoint.getSignature());
        System.out.println("▶ 반환값: " + result);
    }

    // -----------------------------------------
    // 3) 예외 발생 시 (@AfterThrowing)
    // -----------------------------------------
    @AfterThrowing(value = "allAopMethods()", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("▶ EXCEPTION: " + joinPoint.getSignature());
        System.out.println("▶ 예외 메시지: " + ex.getMessage());
    }

    // -----------------------------------------
    // 4) 메서드 실행 직후 (성공/실패 관계없음 - Finally) (@After)
    // -----------------------------------------
    @After("allAopMethods()")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("▶ AFTER(무조건 실행): " + joinPoint.getSignature());
    }

    // -----------------------------------------
    // 5) 실행 전후를 모두 감싸는 (@Around)
    // -----------------------------------------
    @Around("allAopMethods()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("▶ [AROUND-전] " + joinPoint.getSignature());

        Object result = null;

        try {
            result = joinPoint.proceed(); // 실제 메서드 실행
        } catch (Throwable ex) {
            System.out.println("▶ [AROUND-예외] " + ex.getMessage());
            throw ex; // 예외를 다시 던져줘야 정상 작동함
        }

        System.out.println("▶ [AROUND-후] " + joinPoint.getSignature());

        return result;
    }
}

