package com.acorn.day2Batis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@Transactional   //   테스트 후 자동 롤백
@SpringBootTest
class OrderRpositoryTest2 {


    @Autowired
    OrderRpository repository;


    @Test
    public void test(){
        int size = repository.selectAll().size();
        assertTrue(  size >=1);

    }
}