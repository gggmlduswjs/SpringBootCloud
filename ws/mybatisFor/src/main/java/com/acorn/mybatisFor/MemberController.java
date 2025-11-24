package com.acorn.mybatisFor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class MemberController {


    @Autowired
    MemberService  service;


  // 전제조회하기
    @ResponseBody
    @GetMapping("/memberSearchAll")
    public List<Member> getUser() throws Exception {
        return  service.getMembers();
    }


    //선택한 고객만 조회하기를 위한 연습


    //1. 임의의 고객리스트로 조회하기 연습
    //해당고객만 조회하기    select * from where  id  in ( 'acorn', 'acorn3', 'acorn4')
    @ResponseBody
    @GetMapping("/searchTest1")
    public List<Member> getUser2() throws Exception {

        List<String> list =  new ArrayList<>();
        list.add("acorn");
        list.add("acorn3");
        list.add("acorn4");
        return  service.getMembers2( list);
    }


    // 2. 화면에서  사용자가 선택한 해당고객 확인하기
    @ResponseBody
    @GetMapping("/searchTest2")
    public List<String> getUser3(  @RequestParam( name = "userid") String[] userid) throws Exception {
        
        //String을 List로 변환하기
        List<String> list = Arrays.asList(userid);
        System.out.println( list);
        return  list;
    }


    //최종, 사용자가 선택하 정보조회하기
    
    //선택한 고객정보  userid 여러 개 => String[] 받기
    //해당고객만 조회하기    select * from where  id  in ( 'acorn', 'acorn3', 'acorn4')
    //사용자가 선택한 해당고객정보 조회하기
    @ResponseBody
    @GetMapping("/memberSearch2")
    public List<Member> getUser4(  @RequestParam( name = "userid") String[] userid) throws Exception {
        List<String> list = Arrays.asList(userid);
        System.out.println(list);
        return service.getMembers2(list);
    }


    //선택한 고객정보  userid 여러 개 =>  List<String> 받기
    //해당고객만 조회하기    select * from where  id  in ( 'acorn', 'acorn3', 'acorn4')
    @ResponseBody
    @GetMapping("/memberSearch3")
    public List<Member> getUser5(  @RequestParam( name = "userid") List<String> userid) throws Exception {
        System.out.println(  userid);
        return  service.getMembers2( userid);
    }





    //선택한 고객정보  userid 여러 개 =>  List<String> 받기
    //해당고객만 조회하기    select * from where  id  in ( 'acorn', 'acorn3', 'acorn4')
    @ResponseBody
    @GetMapping("/memberInsert")
    public void insert(   ) throws Exception {
         service.registerCustomers(  );
    }



    @ResponseBody
    @GetMapping("/insertMember")
    public  String  registerMember(){
        service.registerCustomers();
        return  "등록";
    }



    @ResponseBody
    @GetMapping("/insertMember2")
    public  String  registerMember2(){
        service.registerCustomers2();
        return  "등록";
    }

}
