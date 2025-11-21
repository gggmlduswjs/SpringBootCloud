package com.example.helloday01;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Task6Service {


    public String  getDivisor( int su){

        ArrayList<Integer> list  = new ArrayList<>();
        for( int i=1 ; i<=12; i++){
            if( su  % i ==0)  list.add( i);
        }

        String result  = list.toString();
        return  result;

    }
}
