package com.interfacestypes.normal;

public interface PrintData {
	
//	public abstract void printInteger(int number);
	//abstract class
	 
	 void printInteger(int number);
	 
	 void printString (String message);
	 
//	 void printFloat (float floatNum);
	 
	 //version 1.8
	 default void printHello () {
		 System.out.println("Hello");
		 printHi();
	 }
	 
	 //version 1.8
	 static void printHelloWorld () {
		 System.out.println("Hello WOrld I am Static");
	 }
	 
	 //version 1.9
	 private void printHi() {
		 System.out.println("hi I am Private");
	 }
}
