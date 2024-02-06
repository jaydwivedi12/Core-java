package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ArithmeticException;
public class ExceptionDemo {

	public static void main(String[]args) {
	
		System.out.println("Hello");
		
		try {
			try { 
				int n1=1;
				int n2=0;
				System.out.println(n1/n2);
			} catch(ArithmeticException e) {
				e.printStackTrace();
			}
			FileInputStream fileInput=new FileInputStream("E://text.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
