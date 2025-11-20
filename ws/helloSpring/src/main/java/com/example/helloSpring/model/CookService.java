package com.example.helloSpring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CookService {

    @Autowired
    CookSelector  cookSelector;



    public   Cook  getCookName(){

        return   cookSelector.getTodayCook();
    }
}
