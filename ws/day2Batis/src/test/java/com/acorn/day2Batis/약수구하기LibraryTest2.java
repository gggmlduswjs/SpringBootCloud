package com.acorn.day2Batis;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class 약수구하기LibraryTest2 {

    @Test
    public void test(){
        약수구하기Library a=new 약수구하기Library();
        List<Integer> list=a.약수구하기0(12);    // 1,2,3,4,6,12 (6개)

        assertTrue(list.size()==6);;
    }


    @Test
    public void test2(){
        약수구하기Library a=new 약수구하기Library();
        List<Integer> list=a.약수구하기0(12);    // 1,2,3,4,6,12 (6개)

        assertTrue(list.size()==6);;
    }

    @Test
    public void test3(){
        약수구하기Library a=new 약수구하기Library();
        List<Integer> list=a.약수구하기0(12);    // 1,2,3,4,6,12 (6개)

        assertTrue(list.size()==6);;
    }

}