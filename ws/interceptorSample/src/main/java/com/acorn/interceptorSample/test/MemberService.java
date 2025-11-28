package com.acorn.interceptorSample.test;

public class MemberService {

    private final MemberRepository memberRepository;

    // 생성자 주입
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void hello() {
        System.out.println("Hello MemberService!");
        memberRepository.save();
    }
}
