package com.example.helloSpring.model;
 

public class HoonCook extends Cook implements 중식가능한 {

	public HoonCook(String name) {
		super(name);
	}

	@Override
	public String 탕수육만들기() {

		return "탕수육굿";
	}

	@Override
	public String toString() {
		return "HoonCook [name=" + name + ", 탕수육만들기()=" + 탕수육만들기() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
