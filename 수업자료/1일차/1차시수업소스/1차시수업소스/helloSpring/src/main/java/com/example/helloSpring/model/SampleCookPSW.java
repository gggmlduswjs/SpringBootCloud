package com.example.helloSpring.model;



public class SampleCookPSW  extends Cook implements 일식가능한{

	
		 //기본생성자
	// 자식의 생성자에서는 부모의기본 생성자를 무조겅 호출한다
	 public SampleCookPSW() {
			super();
		 }
	

	public SampleCookPSW(String name) {
		super(name);
		
		//super(name); //명시적으로 부모의 매개변수가 있는 생성자 호출
	}


	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "광어초밥";
	
	 
	}

}