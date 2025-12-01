package com.example.aop;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String hello(String name) {
        return "Hello " + name;
    }
}
