package com.acorn.interceptorSample.config;

import com.acorn.interceptorSample.test.MemberRepository;
import com.acorn.interceptorSample.test.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//java config

@Configuration
public class AppConfig {
    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }


    @Bean
    public MemberService memberService() {
        // 생성자 주입 방식
        return new MemberService(memberRepository());
    }

}


