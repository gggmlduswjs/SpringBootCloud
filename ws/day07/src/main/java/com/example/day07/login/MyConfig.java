package com.example.day07.login;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {
    
    // Session check 인터셉터 등록하기


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MySessionInterceptor())
                .addPathPatterns("/test/**")
//                .addPathPatterns("/test/**","admin/**",)
                .order(1);

    }
}
