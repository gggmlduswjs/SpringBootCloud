package com.example.day03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository repository;

    // 테스트 매서드
//    @Test
    public void test(){

        List<Member> list=repository.selectAll();
        int size=list.size();

        assertTrue(size>=1);

    }

//    @Test
    public void test2(){

        List<Member> list=repository.selectSearchTest();
        int size=list.size();

        assertTrue(size>=1);

    }

    @Test
    public void test3(){
        //
        List<String> userid= new ArrayList<>();
        userid.add("acorn");
        userid.add("acorn3");
//        userid.add("acorn4");

        List<Member> list=repository.selectSearch(userid);
        int size=list.size();

        assertTrue(size>=1);

    }

}