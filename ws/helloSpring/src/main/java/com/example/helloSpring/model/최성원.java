package com.example.helloSpring.model;

 

public class 최성원 extends Cook implements 일식가능한 {

	
	//기본 생성자
	//자식의 생성자에서는 부모의 기본생성자를 무조건 호출한다.
	public 최성원() {
		 super(); //
	}
	
	public 최성원(String name) {
		//부모의 기본생성자 호출
		//this.name = name;
		
		super(name); //명시적으로 부모의 매개변수가 있는 생성자 호출
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "초밥말고 안심돈까스";
	}
	
	
		

}