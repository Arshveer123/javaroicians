package com.qa.java;

public class Constructor {
	static String s;
	static int a;
	public Constructor() {
		a =10;
		s= "Arshveer";
		System.out.println("Value of a is "+a+"  value of String is  "+s);
	}
	public Constructor(String s,int a) {
		this.a= a;
		this.s= s;
		System.out.println("this is two parameter constructor in which a is "+a+" and s is "+s);
	}

	public static void main(String[] args) {
		
		Constructor x= new Constructor();
		Constructor x1= new Constructor("Zorawar", 2);
		System.out.println(x.a);
		

	}

}
