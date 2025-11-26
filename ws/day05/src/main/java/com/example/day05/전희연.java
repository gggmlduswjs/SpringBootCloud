package com.example.day05;

public class 전희연 {

    // 심부름 기능
    // 입력 : 돈, 살 물건의 가격
    // 반환 : 잔액
    
    //throw:예외일으키기
    //throws 예외 던지기, 상위에 예외처리 미루기(매서드를 호출한 쪽으로)

    public int 심부름하기(int 돈, int 물건가격) throws 잔액부족예외상황 {
        int 잔액=0;

        // 돈이 부족한 상황일 때 예외발생시킴, 상위에게 전달(예외 던지기)
        if(물건가격 > 돈) {
            //예외상황
            // throw 예외 일으키기
            throw new 잔액부족예외상황();
        }else {
            //심부름을 수행하다
            잔액=돈-물건가격;
        }

        
        return 잔액;
    }


    public int 심부름하기2(int 돈, int 물건가격) throws 잔액부족예외상황2 {
        int 잔액=0;

        // 돈이 부족한 상황일 때 예외발생시킴, 상위에게 전달(예외 던지기)
        if(물건가격 > 돈) {
            //예외상황
            // throw 예외 일으키기
            throw new 잔액부족예외상황2();
        }else {
            //심부름을 수행하다
            잔액=돈-물건가격;
        }


        return 잔액;
    }


}
