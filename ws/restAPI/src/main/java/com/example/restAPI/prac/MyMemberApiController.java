package com.example.restAPI.prac;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyMemberApiController {

    //전체맴버조회 json응답하기
    //매핑이름 룰 : 복수명사 사용하기
    // 역할 : method로 구분하기(get, get pathveriable post,post, put, delete)
    @ResponseBody
    @GetMapping("/acorns")
    public List<Acorn> getDataList(){
        //서비스를 통해서 맴버정보 가져오기
         List<Acorn> list= new ArrayList<>();
         list.add(new Acorn("A01"," 이동규"));
        list.add(new Acorn("A02"," 전희연"));
        list.add(new Acorn("A03"," 이혜린"));

        return list;
        //
    }

    // 요청바디에 json 데이터==> Acorn 객체
    @ResponseBody
    @PostMapping("/acorns")
    public int registerMember(@RequestBody  Acorn acorn) {

        System.out.println(acorn);  //기본생성자,setter필수
        System.out.println("회원가입한다");
        return 1;
    }

}
