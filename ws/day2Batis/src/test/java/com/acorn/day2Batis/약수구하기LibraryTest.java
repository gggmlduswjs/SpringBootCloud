package com.acorn.day2Batis;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class 약수구하기LibraryTest {


    @Test
    public  void test(){

        약수구하기Library  lib = new 약수구하기Library();
        List<Integer> list  = lib.약수구하기2(10);
        System.out.println( list);
        assertTrue( list.size()==4);

    }

}