package com.acorn.ExceptionSample.예외처리;


public class 김서호Main {


    public static void main(String[] args) {      // jvm 자바가상머신

        전희연 a= new 전희연();

        int 잔액=0;
        int 돈=1000;
        int 살물건=2000;

        try {
            잔액= a.심부림하기( 돈,살물건);
        } catch (Exception e) {
            System.out.println("잔액이 부족한 상태에서는 어떤작업을 한다");
            System.out.println("잔액이 부족합니다. 충전 후 다시 시도해주세요.");
            System.out.println("잔액 부족 발생: 요청  "+살물건+", 현재잔액 "+ 돈  +"로그남기기");

            //throw new RuntimeException();
            // 필요에 따라 예외를 다시 발생시킬 수 있다.
            // 이렇게 하면 예외가 상위로 전파되고, 현재 메서드 흐름이 종료된다.
            // 즉, 정상적인 종료가 되지 않도록 할 수 있다.

            //throw = 현재 흐름 즉시 종료 + 상위 호출자에게 예외 전달
            //흐름을 계속 이어가고 싶으면 catch에서 그냥 처리만 하고 throw 사용 안 함

        }


        System.out.println("잔액"  + 잔액);

    }
}
