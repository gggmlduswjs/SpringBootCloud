package com.example.day08Valid;

// 스프링부트 config 파일 만들기

import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// global validator 등록하기


@Configuration
public class GlobalValidatorConfig implements WebMvcConfigurer {
    @Override
    public Validator getValidator() {
        return new OrderValidator();
    }
}
