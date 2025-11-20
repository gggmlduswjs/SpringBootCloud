package com.example.helloSpring.model;

public class SampleCook4  extends Cook  implements 한식가능한 {
 
	
	//기본생성자
	//자식의 생성자에서는 부모의 기본생성자를 무조건 호출한다
	public  SampleCook4() {
	     super();   
		
	} 
	
	
	
	public SampleCook4(String name) {
		//부모의 기본생성자 호출		
		//this.name  = name;
		
		super(name); //명시적으로 부모의 매개변수가 있는 생성자 호출
				
	}



	@Override
	public String 비빔밥만들기() {
	 
		return  "전주비빔밥";
	}
 
	  
	

}
