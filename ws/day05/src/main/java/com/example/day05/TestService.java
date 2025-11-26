package com.example.day05;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    // 매서드
    // 문자열 -> 소문자로 변경
    public String getLowerString(String str) {
        String result = str.toLowerCase();
        return result;
    }
}
