package com.chainsys.exceptions;
/**
 * Author - omku3117
 * date - 01-04-2022
 */
import java.util.Scanner;

public class DemoB {
	
	public static void main(String args[])
	{
		m4();
	}
	public static void tryCatchFinally()
	{
		System.out.println("Before try");
		try
		{
			System.out.println("Inside try");
		}
		catch(Exception err) {
			System.out.println("IndSide try"+err.getMessage());
		}
		finally
		{
			System.out.println("Inside finally");
		}
		System.out.println("After try");
	}
	public static void tryCatch()
	{
		System.out.println("Before try");
		try
		{
			System.out.println("Inside try");
		}
		catch(Exception err) {
			System.out.println("IndSide try"+err.getMessage());
		}
		
		System.out.println("After try Catch");
	}
	public static void tryFinally()
	{
		System.out.println("Before try");
		try
		{
			System.out.println("Inside try");
		}
		finally
		{
			System.out.println("Inside finally");
		}
		System.out.println("After Try-Finally");
	}
	public static void multipleTry()
	{
		int x=0;
		int y=0;
		int z=0;
		System.out.println("Before Try 1");
		Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
		}
		catch(Exception err)
		{
			System.out.println("Error while creating Scanner"+err.getMessage());
			return;
		}
		System.out.println("After try 1");
		System.out.println("Before Try 2");
		
		try // Try 2
		{
			System.out.println("Inside try2");
			System.out.println("Enter value for X");
			x=sc.nextInt();
			}
		catch(Exception err) 
		{
			System.out.println("Inside Catch - Invalid value for X"+err.getMessage());
			return;
		}
		// End of Try 2
		System.out.println("After try 2");
		
		System.out.println("Before Try 3");
		
		try // Try 3
		{
			System.out.println("Inside try3");
			System.out.println("Enter value for Y");
			y=sc.nextInt();
			}
		catch(Exception err) 
		{
			System.out.println("Inside Catch - Invalid value for y"+err.getMessage());
			return;
		}
		finally
		{
			System.out.println("Inside Finally 3");
			sc.close();
		}
		System.out.println("After finally 3");
		
		try {// Try 4
			z = x/y;
			System.out.println("Z ="+z);
		}
		catch(Exception e)
		{
			System.out.println("Error in Block 4 : "+e.getMessage());
		}
		// End of Try 4
		System.out.println("After Try 4");	
	}
	public static void m4()
	{
		System.out.println("Before Try");
		int x=0;
		int y=0;
		int z=0;
		String s1=null,s2=null;
		java.util.Scanner sc=null;
		
		try
		{
			sc=new Scanner (System.in);
			System.out.println("Inside Try");
			System.out.println("Enter value for X");
			s1=sc.nextLine();
			System.out.println("Enter value for Y");
			s2=sc.nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=x/y;
			System.out.println("Result : "+z);
		}
		/*
		 * catch(Exception err) { System.out.println("Inside Catch3 "
		 * +err.getMessage());
		 * System.out.println("Error Type "+err.getClass().getName()); }
		 */
		catch(ArithmeticException err)
		{
			System.out.println("Inside Catch 1"+err.getMessage());
			System.out.println("Error Type "+err.getClass().getName());	
		}
		catch(NumberFormatException err)
		{
			System.out.println("Inside Catch2"+ err.getMessage());
			System.out.println("Error Type "+err.getClass().getName());
		}
		catch(Exception err)
		{
			System.out.println("Inside Catch2"+ err.getMessage());
			System.out.println("Error Type "+err.getClass().getName());
		}
		finally
		{
			System.out.println("Inside Finally");
		}
		System.out.println("After finally");
		 
	}
}
