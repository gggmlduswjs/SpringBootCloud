package com.example.helloSpring.model;

public class Cook{
    String name;
   
    
    //기본생성자 (매개변수가 없는 생성자)
    public Cook() {
		// TODO Auto-generated constructor stub
    	System.out.println(" cook  기본생성자");
	}
    
    //매개변수있는 생성자
	public Cook(String name ) {
		super();
		this.name = name;
		 
	}
	@Override
	public String toString() {
		return "Cook [name=" + name + " ]";
	}

    public String getName() {
        return name;
    }
}
