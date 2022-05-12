package com.chainsys.unit.test;

import com.chainsys.variables.Demo;

/**
 * 
 * @author Venkat
 * Date Mar 24 2022
 */
public class VariableTester {
	/**
	 * Test static,constant,immutable variable
	 */
	public static void testGlobalVariables() {
		// Display the value of the static field
		// Value is zero (Default value)
		// DataA is accessed without creating an object
		// Created on 25 March 2022
		
		System.out.println("DataA = " + Demo.DataA);
		
		// Display the value of immutable field
		// This is not possible without an object
		 System.out.println("DataB = " +Demo.DataB);
		// Display the value of constant field
		
		System.out.println("DataC = " + Demo.DataC);
		// Modifying the value of the static field DataA
		Demo.DataA=2345;
		System.out.println("DataA = "+ Demo.DataA);
		// Modifiying value of the static field DataC
		// Error: The final field Demo.DataC cannot be assigned
	}
	public static void testImmutableVariable()
	{
		/**
		 * Cannot make a static reference to the non static field Demo.DataB
		 * Demo A .DataB=123;
		 * First create object or the class
		 * pass an int value as an argument to the constructor
		 * access the immutable instance field using the object reference
		 */
		Demo firstobject =new Demo(123);
		System.out.println(firstobject.DataB);
		/**
		 *  Value assigned to an immutable field can not be changed
		 *  Value for the immutable field can be assigned only through the constructor
		 */
		
		/**
		 * Calling static method using class name
		 * Without creating an object
		 * Created on 25 MAr 2022
		 */
	}
		public static void testStaticMethod()
		{
			Demo.sayHello();
		}
		/**
		 * Calling non-static method using object reference
		 * Without creating an object, non static methods can not be called
		 * Created on 25 MAr 2022
		 */
		public static void testNonStaticMethod()
		{
			//Error
			//Demo.greetUser();
			Demo firstobject=new Demo(111);
			// call the non static method
			firstobject.greetuser();
		}
	}
