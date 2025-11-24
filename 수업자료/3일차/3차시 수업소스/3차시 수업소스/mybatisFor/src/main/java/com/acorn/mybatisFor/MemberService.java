package com.acorn.mybatisFor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository repository;


    public void registerCustomers( ) {
        List<Member> members = new ArrayList<>();        // 고객 정보 3개 추가
        members.add(new Member("acorn10", "김길동", "kim@domain.com"));
        members.add(new Member("acorn11", "홍길동", "hong@domain.com"));
        members.add(new Member("acorn12", "최길동", "choi@domain.com"));
        for(  Member  member:  members){
            repository.insertMember(member);
        }
    }



    public void registerCustomers2( ) {
        List<Member> members = new ArrayList<>();        // 고객 정보 3개 추가
        members.add(new Member("acorn20", "전길동", "kim@domain.com"));
        members.add(new Member("acorn21", "장길동", "hong@domain.com"));
        members.add(new Member("acorn22", "황길동", "choi@domain.com"));
        repository.insertMembers(members);
    }


    //전체조회
    public List<Member> getMembers() throws Exception {
        return   repository.selectAll();
    }


    //선택한 id에 대한 조회
    public List<Member> getMembers2( List<String> userid) throws Exception {
        return   repository.selectAll2(   userid);
    }


}
