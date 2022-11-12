package com.qa.java;

public class child extends parent{

	public static void main(String[] args) {
		child c= new child();
		c.start();
		c.insurance();
				

	}
	@Override
	public void start() {
		System.out.println("start.....childclass");
		
	}
	public void insurance() {
		System.out.println("Hi.. this is in child class only");
		System.out.println("I am using parent class variable without creating it's object "+a);
	}

}
