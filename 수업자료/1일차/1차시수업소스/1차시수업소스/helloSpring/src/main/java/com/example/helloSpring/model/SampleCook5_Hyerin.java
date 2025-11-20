package com.example.helloSpring.model;

public class SampleCook5_Hyerin extends Cook implements 중식가능한{
	
	public SampleCook5_Hyerin(String name) {
		super(name);
	}

	@Override
	public String 탕수육만들기() {
		return "탕수육";
	}

}
