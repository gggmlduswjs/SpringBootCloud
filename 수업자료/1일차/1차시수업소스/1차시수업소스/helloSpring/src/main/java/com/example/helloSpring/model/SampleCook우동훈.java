package com.example.helloSpring.model;

public class SampleCook우동훈 extends Cook implements 한식가능한 {

	public SampleCook우동훈(String name) {
		super(name);
	}

	@Override
	public String 비빔밥만들기() {
		return "돌솥비빔밥";
	}
	
	
}
