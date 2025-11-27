package com.acorn.pageSample.prac;


import com.acorn.pageSample.Member;
import com.acorn.pageSample.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyMemberService {

    @Autowired
    MemberRepository repository;

    public List<Member> getMembersPage(int currentPage, int pageSize){
        return  repository.selectPageFinal(currentPage, pageSize);
    }

}
