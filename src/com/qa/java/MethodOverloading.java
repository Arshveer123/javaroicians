package com.qa.java;

public class MethodOverloading {

	public static void main(String[] args) {
		sum();
		int i=sum(9,8);
		String s=sum("hii this is java","program");
		System.out.println(s);
		System.out.println(i);
		

	}
	public static void sum() {
		int a,b,c;
		a=2;
		b=3;
		c=a+b;
		System.out.println(c);
	}
	public static int sum(int a, int b) {
		int c=a+b;
		return c;
	}
	public static String sum(String a, String b) {
		String c= a+" "+b;
		return c;
		
	}

}
