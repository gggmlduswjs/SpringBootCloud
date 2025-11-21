package com.example.batis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserRepositoryTest2 {

    @Autowired
    UserRepository repository;

    // 테스트매서드작성
    @Test
    public void test1() throws Exception {

        List<User> list=repository.selectAll();
        assertTrue(list.size()>=1);
    }

}