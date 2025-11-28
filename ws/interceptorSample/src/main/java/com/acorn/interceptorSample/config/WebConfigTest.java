package com.acorn.interceptorSample.config;
import com.acorn.interceptorSample.interceptor.TestInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


// @Configuration   설정등록 의미
//@Configuration
public class WebConfigTest implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor( new TestInterceptor())
                .addPathPatterns("/**").order(1);


    }
}
