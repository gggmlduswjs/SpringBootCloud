package com.acorn.day2Batis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 약수구하기Library {



    public List<Integer> 약수구하기0( int su){  
        List<Integer> list  = new ArrayList<>();
        for( int i=1; i<= su ; i++){   //1~자기자신
            if( su % i==0)   list.add(i);
        }
        return  list;

    }


    public List<Integer> 약수구하기1( int su){
        List<Integer> list  = new ArrayList<>();
        for( int i=1; i<= su/2 ; i++){   //
            if( su % i==0)   list.add(i);
        }
        //자기자신 추가
        list.add(su);
        return  list;

    }   // 50까지


    // 6의 약수 구하기
    //1~6 확인하기 (전체)
    //3까지 확인하기 (절반)
    //2까지 확인하기 (제곱근 ) 1*6 2*3

    public List<Integer> 약수구하기2(int su) {

        List<Integer> list = new ArrayList<>();

        if (su <= 0) {
            return list;  // 혹은 IllegalArgumentException 던져도 됨
        }

        for (int i = 1; i <= Math.sqrt(su); i++) {                  // 10까지
            if (su % i == 0) {
                list.add(i);
                if (i != su / i) {    // 짝 약수 추가                        // 1   * 6     2  * 3
                    list.add(su / i);
                }
            }
        }

        //Collections.sort(list);  // 약수 오름차순 정렬
        return list;
    }

}
