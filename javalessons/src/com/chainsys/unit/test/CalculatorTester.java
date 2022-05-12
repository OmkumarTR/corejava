package com.chainsys.unit.test;

import com.chainsys.variables.Calculator;

public class CalculatorTester {
	
	public static void Testadd() 
	{
		int arg1=100;
		int arg2=50;
		int output =Calculator.add(arg1, arg2);
		System.out.println("result of add is : "+ output);
	}
	public static void Testsubtract() 
	{
		int arg1=100;
		int arg2=50;
		int output =Calculator.Subtract(arg1, arg2);
		System.out.println("result of Subtract is : "+ output);
	}
	public static void Testmultiply() 
	{
		int arg1=100;
		int arg2=50;
		int output =Calculator.multiply(arg1, arg2);
		System.out.println("result of multiply is : "+ output);
	}
	public static void Testdivide() 
	{
		int arg1=100;
		int arg2=50;
		int output =Calculator.divide(arg1, arg2);
		System.out.println("result of divide is : "+ output);
	}
	

}
