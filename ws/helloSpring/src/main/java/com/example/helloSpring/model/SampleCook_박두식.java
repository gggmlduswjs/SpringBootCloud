package com.example.helloSpring.model;

public class SampleCook_박두식 extends Cook implements 일식가능한{
		public SampleCook_박두식(String name) {
			super(name);
		}
	
		@Override
		public String 초밥만들기() {
			return "장어초밥";
		}
}
