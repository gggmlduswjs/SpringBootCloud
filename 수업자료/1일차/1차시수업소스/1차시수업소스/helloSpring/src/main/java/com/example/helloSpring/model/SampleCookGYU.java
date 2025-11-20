package com.example.helloSpring.model;

public class SampleCookGYU extends Cook implements 한식가능한{
	public SampleCookGYU() {
		super();
	}
	
	public SampleCookGYU(String name) {
		this.name=name;
	}
	
	public  String 비빔밥만들기() {
		return "전주비빔밥 계란2개";
	}
}
