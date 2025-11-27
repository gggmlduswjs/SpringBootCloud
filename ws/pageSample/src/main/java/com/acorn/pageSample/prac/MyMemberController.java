package com.acorn.pageSample.prac;


import com.acorn.pageSample.Member;
import com.acorn.pageSample.PageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyMemberController {

    @Autowired
    MyMemberService service;

    //현재페이지에 대한 리스트주세요

    @GetMapping("/myList")
    public  String  getListPage(
            @RequestParam( name="currentPage" , required = false , defaultValue = "1"   )
            int  currentPage  ,  Model model
    ){
        int pageSize=3;//글의 수
        int grpSize=5; //하단의 보이는 페이지 수  [1] [2] [3] [4]  [5]

        //모델
        //-리스트
        //-페이징정보
        List<Member> list  = service.getMembersPage( currentPage , pageSize);
        model.addAttribute("list" , list);
        return   "myList";

    }

    ///  타입리프  1~10까지 반복하기
    ///  if문

    //매핑
    @GetMapping("/testThyme")
    public  String   testThyme( Model model){


        int start=1;
        int end=10;

        model.addAttribute("start" , start);
        model.addAttribute("end", end);


        return  "thymeViewTest";
    }

    //매핑
    @GetMapping("/testThyme2")
    public  String   testThyme2( Model model){

        List<String> list  =new ArrayList<>();
        List<String> listNull  =null;
        int num=10;

        model.addAttribute("num", num);
        model.addAttribute("list", list);
        model.addAttribute("listNull", listNull);

        return  "thymeViewTestIF";
    }

    @GetMapping("/testThyme3")
    public String testThyme3(Model model){
        model.addAttribute("num", 12);


        return "thymeViewTestClassappend";
    }

    @GetMapping("myPaging")
    public String myListPageing(Model model){
        //리스트 하단에 페이징정보출력하기
        //
        int currentPage=1;
        int totRecords=100;
        int pageSize=10;
        int grpSize=5;

        PageHandler pageHandler=new PageHandler(currentPage,totRecords,pageSize,grpSize);

        model.addAttribute("pageHandler",pageHandler);
        return  "myListPaging";

    }





}
