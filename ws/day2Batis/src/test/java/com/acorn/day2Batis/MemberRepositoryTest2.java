package com.acorn.day2Batis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MemberRepositoryTest2 {

    @Autowired
    MemberRepository repository;

    @Test
    public void test(){

        List<Member> list=repository.selectAll();    // 1,2,3,4,6,12 (6개)

        assertTrue(list.size()>=1);;
    }


}