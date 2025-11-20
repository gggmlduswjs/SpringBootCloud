package com.example.helloSpring.model;

public class SampleCook_윤태민 extends Cook implements 일식가능한 {

	public SampleCook_윤태민(String name) {
		super(name);
	}
	
	@Override
	public String 초밥만들기() {
		return "초밥";
	}

}
