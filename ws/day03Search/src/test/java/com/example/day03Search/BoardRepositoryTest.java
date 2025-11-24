package com.example.day03Search;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardRepositoryTest {

    @Autowired
    BoardRepository repository;

    //
//    @Test
    public void test() {
        List<Board> list = repository.selectAll();
        assertTrue(list.size()>=1);
    }

//    @Test
    public void test2() {
        List<Board> list = repository.selectSearch();
        assertTrue(list.size()>=1);
    }

//    @Test
    public void test3() {
        String search="첫 번째";
        List<Board> list = repository.selectSearchTest(search);
        assertTrue(list.size()>=1);
    }

    @Test
    public void test4() {
        SearchCondition searchCondition = new SearchCondition();
        searchCondition.setCondition("content");
        searchCondition.setKeyword("다형성");

        List<Board> list = repository.selectSearchFinal(searchCondition);
        assertTrue(list.size()>=1);
    }

}


