package com.example.helloday01;


import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Task6Service {

    public String getDivisor(int su){
        //1,2,3,4,6,12
        ArrayList<Integer> list  = new ArrayList<>();
/*
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
*/

        for( int i=1 ; i<=12; i++){
            if( su  % i ==0)  list.add( i);
        }



        String result  = list.toString();



        return  result;
    }
}
