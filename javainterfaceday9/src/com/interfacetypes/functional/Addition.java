package com.interfacetypes.functional;

public class Addition implements ArithmeticOperation {

	@Override
	public int operation(int num1, int num2) {

		return num1+num2;
	}

}
