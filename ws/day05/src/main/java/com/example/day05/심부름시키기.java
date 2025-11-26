package com.example.day05;

public class 심부름시키기 {
    public static void main(String[] args) {
        전희연 a=new 전희연();

        int 돈=1000;
        int 물건=20000;


        try {
            a.심부름하기(돈,물건);
        } catch (잔액부족예외상황 e) {
            System.out.println("돈이 부족한 경우 대비 코드");
//            throw new RuntimeException(e);
        }
        
        System.out.println("정상종료");
    }
}
