package com.example.helloSpring.model;

public class SampleCook1  extends Cook implements 일식가능한 {

	
	
		
	public SampleCook1( String name) {		 
	      super(name)	;
	}
	
	
	
	@Override
	public String 초밥만들기() {		
		
		
		return "모듬초밥";
	}

}
