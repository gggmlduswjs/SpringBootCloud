package com.example.helloSpring.model;

public class SampleCook5_최정문 extends Cook implements 한식가능한{ 
	public SampleCook5_최정문() {
		super();
	}
	
	public SampleCook5_최정문(String name) {
		this.name=name;
		
	}
	
 

	@Override
	public String 비빔밥만들기() {
		// TODO Auto-generated method stub
		return "육회비빔밥";
	}
}

//list.add(new SampleCook5_최정문("최정문"));