package com.qa.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement {

	public static void main(String[] args) throws FileNotFoundException {
	File file= new File("C:\\Users\\HH\\eclipse-workspace\\Roicians\\src\\newFile.txt");
try {
	file.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try (FileOutputStream fo = new FileOutputStream(file)) {
	String c= "hi ,,, i am java";
	byte[] b= c.getBytes();
	try {
		fo.write(b);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	throw e;
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
