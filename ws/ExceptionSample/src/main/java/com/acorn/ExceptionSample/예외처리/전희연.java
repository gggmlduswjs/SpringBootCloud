package com.acorn.ExceptionSample.예외처리;

public class 전희연 {


    //매서드 : 심부름하기
    //입력: 돈, 물건값
    //반환: 잔액


    //물건값보다  돈이 부족한 상황을 누가 처리해야 할까? 생각해보기
    // 호출하는 쪽에서 예외상황에 대비하는 코드를 작성해야 함
    // 예외를 일으키는 코드를 추가하고 예외를 던지는 방법을 사용함  (이 매서드를 호출하는 쪽에서 예외처리를 강제하게 할 수 있음)


    //Exception을 상속받은 예외 :  checkedException

    public  int  심부림하기(  int   돈  , int 물건가격) throws Exception {

        int 잔액=0;


        if( 물건가격 > 돈){
            //예외일으키기  ( 돈이 부족한 상황의 예외 일으키기)
            throw new Exception("잔액부족");  //Exception을 상속받은 예외를 만들어도 모두 checked Exception

        }else{
           잔액 =  돈- 물건가격;
        }

        return  잔액;
    }
}
