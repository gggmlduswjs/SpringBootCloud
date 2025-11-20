package com.example.helloSpring.model;

public class SampleCook5_전희연 extends Cook implements 한식가능한{

	public SampleCook5_전희연() {
		super();
	}
	
	public SampleCook5_전희연(String name) {
		this.name=name;
		
	}
	
 

	@Override
	public String 비빔밥만들기() {
		// TODO Auto-generated method stub
		return "육회비빔밥";
	}
	
	

}
