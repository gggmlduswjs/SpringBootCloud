package com.acorn.pageSample;

public class PageHandlerMain {

    public static void main(String[] args) {
        //  //현재페이지, 전체레코드수, 페이지사이즈 , 그룹사이즈
        PageHandler  pageHandler  = new PageHandler(1,40,10,3);



        System.out.println( "현재페이지"  +  pageHandler.getCurrentPage());
        System.out.println( "현재그룹"+pageHandler.getCurrentGrp());
        System.out.println(  "현재그룹의 시작번호"+pageHandler.getGrpStartPage());
        System.out.println( "현재그룹의 마지막번호"+pageHandler.getGrpEndPage());
        System.out.println(  "총페이지"+pageHandler.getTotalPage());


    }
}
