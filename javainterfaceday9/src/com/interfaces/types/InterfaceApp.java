package com.interfaces.types;

import com.interfacestypes.normal.PrintData;
import com.interfacestypes.normal.PrintDataImpl;

public class InterfaceApp {

	public static void main(String[] args) {
		
		
		PrintData print =new PrintDataImpl();
		
//		print.printInteger(10);
//		
//		print.printString("I am from india");
		
		print.printHello();
		
		
		//static can call directly without making object 
//		PrintData.printHelloWorld();
	}
}
