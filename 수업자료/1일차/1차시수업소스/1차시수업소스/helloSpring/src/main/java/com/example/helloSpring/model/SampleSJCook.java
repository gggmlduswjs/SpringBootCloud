package com.example.helloSpring.model;

public class SampleSJCook extends Cook implements 일식가능한{

	public SampleSJCook(String name) {
		super(name);
	}

	@Override
	public String 초밥만들기() {
		return "소고기 초밥";
	}
	
}
