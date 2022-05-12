package com.chainsys.exceptions;

import java.util.Scanner;

public class Calculator {
	
	public int divide (int pValueA, int pValueB)
	{
		return pValueA/pValueB;
	}
	public static void testDivide()
	{
		Calculator calculator =null;
		int args1= 100;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number less than 100");
		int args2 = sc.nextInt();
		int result=0;
		System.out.println("Before");
		calculator =new Calculator();
		result=calculator.divide(args1, args2);
		System.out.println("Result "+result);
		System.out.println("After");
		sc.close();
	}
	public static void testDivideWithTry()
	{
		/**
		 * Before Try: use for local variable declaration
		 * Dont instantiate the variables here
		 */
		Calculator calculator =null;
		int args1= 100,args2=0,result=0;
		Scanner scanner=null;
		System.out.println("Before");
		try
		{
			System.out.println("Inside Try");
			scanner = new Scanner(System.in);
			System.out.println("Enter a number less than 100");
			args2=scanner.nextInt();
			calculator =new Calculator();
			result=calculator.divide(args1, args2);
			System.out.println("Result "+result);
			System.out.println("After");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch: "+e.getMessage());
		}
		finally
		{
			// Finally will run when there is ERROR or NO ERROR
			System.out.println("Inside finally");
			scanner.close();
		}
		System.out.println("After Try-Catch Finally");
		
	}
	
	public static void callDivide()
	{
		Calculator calculator=null;
		int result=0;
		System.out.println("Before try catch finally");
		try
		{
			calculator = new Calculator();
			calculator.divide(100,0);
			System.out.println("Result : "+result);	
		}
		catch(Exception err)
		{
			String msg=err.getMessage();
			System.out.println(msg);
		}
		finally
		{
			System.out.println("Inside finally");
		}
		System.out.println("After try catch finally");
	}
}
