package com.example.day03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    //
    @Autowired
    MemberRepository repository;

    // 선택한 회원정보 제공하기
    public List<Member> getMembers(List<String> userid) {

        return repository.selectSearch(userid);
    }

}
