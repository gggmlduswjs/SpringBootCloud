package com.acorn.ExceptionSample.예외처리;

public class 대리에게일시키기2 {


    public static void main(String[] args) {


        김대리님2  a= new 김대리님2();
        try {
            a.대리가하는일(-10);
        } catch (Exception e) {
            System.out.println("김대리에게 일을 시킨  사람이 처리해야 할 작업들 ");
          //  throw new RuntimeException(e);
        }
    }
}
