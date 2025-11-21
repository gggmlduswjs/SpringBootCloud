package com.example.helloday01;

import java.util.ArrayList;

public class 약수구하기 {

    public static void main(String[] args) {
        //
        int su=12;
        //1,2,3,4,6,12
        ArrayList<Integer> list  = new ArrayList<>();

         if( su  % 1 ==0)  list.add( 1);
         if( su  % 2 ==0)  list.add( 2);
         if( su  % 3 ==0)  list.add( 3);
        if( su  % 4==0)  list.add( 4);
        if( su  % 5 ==0)  list.add( 5);
        if( su  % 6==0)  list.add( 6);
        if( su  % 7 ==0)  list.add( 7);
        if( su  % 8 ==0)  list.add( 8);
        if( su  % 9 ==0)  list.add( 9);
        if( su  % 10 ==0)  list.add(10);
        if( su  % 11 ==0)  list.add( 11);
        if( su  % 12 ==0)  list.add( 12);

        for(  int  item : list){
            System.out.println( item);    // 1  2  3   4  6  12
        }



        String result  = list.toString();
        System.out.println( result);






    }
}
