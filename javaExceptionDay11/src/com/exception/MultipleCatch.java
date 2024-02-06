package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
	 try (Scanner scanner = new Scanner(System.in)){
		System.out.println("Enter Integer Value ");
		int num=scanner.nextInt();
	} catch (InputMismatchException inputMismatchException) {
		System.out.println(inputMismatchException.getMessage());
	}catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	}

}
