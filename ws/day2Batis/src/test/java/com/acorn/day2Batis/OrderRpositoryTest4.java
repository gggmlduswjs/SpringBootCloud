package com.acorn.day2Batis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class OrderRpositoryTest4 {

    @Autowired
    OrderRpository orderRpository;

    @Test
    public void  test(){
        List<Map<String,Object>> list= orderRpository.selectAll();

        assertTrue(list.size()>=1);
    }

}