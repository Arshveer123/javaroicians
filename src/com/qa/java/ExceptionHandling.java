package com.qa.java;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a,b,c;
		a=5;
		b=0;
		try {
		c=a/b;
		System.out.println(c);
		//System.out.println("hi..");
		} catch(Exception e) {
			System.out.println("i am inside catch block");
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		System.out.println("hi..i am outside exception block");
	

	}

}
