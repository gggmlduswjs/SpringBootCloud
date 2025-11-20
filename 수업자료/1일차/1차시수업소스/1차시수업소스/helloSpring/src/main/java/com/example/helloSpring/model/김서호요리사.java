package com.example.helloSpring.model;

public class 김서호요리사 extends Cook implements 중식가능한   {

	public 김서호요리사(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 탕수육만들기() {
		// TODO Auto-generated method stub
		return "바삭바삭옛날탕수육";
	}

}
