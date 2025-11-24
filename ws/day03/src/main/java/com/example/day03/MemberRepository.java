package com.example.day03;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepository {

    //mybatis 주입받기

    @Autowired
    SqlSession session;


    // 전체조회
    public List<Member> selectAll() {
        //
        return session.selectList("a.selectAll");
    }

    //
    public List<Member> selectSearchTest() {
        return  session.selectList("a.testSearch");

    }

    // 매개변수로 전달받은 list에 대한 조회하기
    public List<Member> selectSearch( List<String> userid){
        return  session.selectList("a.selectMemberSearch", userid);
    }



}
