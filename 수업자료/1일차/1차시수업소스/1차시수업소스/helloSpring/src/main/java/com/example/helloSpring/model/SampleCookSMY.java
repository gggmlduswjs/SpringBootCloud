package com.example.helloSpring.model;

public class SampleCookSMY extends Cook implements 한식가능한 {
	public SampleCookSMY(String name) {
		super(name);
	}
	
	@Override
	public String 비빔밥만들기() {
		// TODO Auto-generated method stub
		return "돌솥비빔밥";
	}
}
