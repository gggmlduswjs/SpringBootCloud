package com.example.day03;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService service;
    
    
    // 매서드 단위의 매핑

    // 회원정보 조회하기
    //회원정보 조회하기
    @GetMapping("/memberSearch")
    public  String  getMembers(  @RequestParam ( name="userid") String[] userid  , Model model){

        //1.선택한 회원아이디 정보 확인하기
        System.out.println(Arrays.toString( userid));
        //2.서비스 와 repository 를 통해서 선택한 회원정보 가져오기

        //List로 변환하기
        List<String> list  = Arrays.asList(userid );

        //3.모델에 저장하기
        List<Member> resultList = service.getMembers(list);

        System.out.println( "최종결과" + resultList );
        model.addAttribute("list" , resultList );


        return "memberList";  //  memberList  뷰 만들기
    }
    
}
