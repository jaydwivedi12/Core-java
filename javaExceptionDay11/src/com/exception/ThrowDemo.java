package com.exception;

import com.exception.custom.UnderAgeException;

public class ThrowDemo {

	public static void main(String[] args) throws UnderAgeException,ClassNotFoundException {
		int age=2;
		try {
			checkAge(age);
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
		
		importSqlPackage();
	}
	
	static void checkAge(int age) throws UnderAgeException {
		if (age>18) {
			System.out.println("Can vote");
		}
		else {
			// throw custom exception
			throw new UnderAgeException("Voter age must be 18 years ");
			// Unreachable Code 
           //System.out.println("After Throw Statement");
		}
			
	}
	
	// Extension Class Loader
	static void importSqlPackage() throws ClassNotFoundException,UnderAgeException{
		Class.forName("com.sql.jdbc.Driver");
		throw new UnderAgeException("Under Age");
	}
	
}
