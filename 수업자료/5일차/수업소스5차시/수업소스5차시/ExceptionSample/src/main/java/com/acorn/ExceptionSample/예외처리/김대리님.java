package com.acorn.ExceptionSample.예외처리;

public class 김대리님 {


    public  void  대리가하는일( int 돈){




        // 대리가 해야하는 일이 있고
        // 상사에 넘겨야 하는 일이 있다
         if( 돈<0){

             try {
                 throw new Exception( "음수예외");
             } catch (Exception e) {
                 System.out.print("음수가 발생하면 어떤 조치를 취한다");
                 throw new RuntimeException(e);   //상위로 넘김 , 상위에서 예외처리를 꼭 할 필요없다.
             }


         }else{
             System.out.println("대리가 할일을 한다");
         }


    }
}
