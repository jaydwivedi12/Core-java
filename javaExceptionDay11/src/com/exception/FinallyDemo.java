package com.exception;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
//		try {
//			System.out.println(10/1);
//			System.exit(0);
//		}
//		finally {
//			System.out.println("I am finally block");
//		}
	
		
		//try with resources
		try(Scanner scanner=new Scanner(System.in)) {
			int number =scanner.nextInt();
		} catch (NumberFormatException numberFormatException) {
			System.out.println(numberFormatException.getMessage());
		}

	}

}
