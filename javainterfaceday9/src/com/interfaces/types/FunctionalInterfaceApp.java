package com.interfaces.types;

import com.interfacetypes.functional.Addition;
import com.interfacetypes.functional.ArithmeticOperation;
import com.interfacetypes.functional.Subtraction;

public class FunctionalInterfaceApp {

	public static void main(String [] args) {
		ArithmeticOperation addition=new Addition();
		int result=addition.operation(10,20);
	    System.out.println(result);
	    
//	    Polymorphism
//	    addition=new Subtraction();
	    
	    ArithmeticOperation substraction=new Subtraction();
		substraction.operation(10,20); 
		System.out.println(substraction.operation(10,20));

	
//	anonymous class
	ArithmeticOperation multiplication= new ArithmeticOperation() {
		@Override
		public int operation(int n1, int n2) {
			return n1*n2;
		}
	};
	
	System.out.println(multiplication.operation(10,5));
	
	
	
//	lambda expression 
	ArithmeticOperation add = (int n1, int n2)->n1+n2;
	ArithmeticOperation sub = (int n1, int n2)->n1-n2;
	ArithmeticOperation multi= (int n1, int n2)->n1*n2;
	ArithmeticOperation div = (int n1, int n2)->n1/n2;
	
	System.out.println("Lambda Results are :");
	System.out.println("Add "+ add.operation(10,20));
	System.out.println("Sub  "+ sub.operation(10,20));
	System.out.println("Multi  "+ multi.operation(10,20));
	System.out.println("Div "+ div.operation(10,20));
	}
}
