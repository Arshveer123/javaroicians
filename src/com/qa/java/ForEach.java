package com.qa.java;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<String>(Arrays.asList("Zorawar","Arshveer","Tom","Peter","Scott"));
		for(String s: names) {
			
			if(s.equals("Tom")) {
				System.out.println(s);
				break;
			}
		}
System.out.println("I am outside for loop");
	}

}
