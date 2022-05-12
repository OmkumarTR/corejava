package com.chainsys.variables;
/**
 * 
 * @author Venkat
 * Date 24-03-2022
 */
public class Demo {
	// Static global variable
	public static int DataA; 
	// Immutable global variable (not static)
	public static int DataB; 
	public final static int DataC = 300; // Constant

	/**Constructor
	 * Constructor is a special method
	 * The name of the constructor and the name of the class will be same
	 * Constructor dont have return type
	 * Constructor can take parameters
	 * @param DataB
	 */

	public Demo(int DataB) {
		/* Assigning value to the global read only field (this.DataB)*/
		this.DataB = DataB;
	}

// Static method can be called without an object
	public static void sayHello() {
		System.out.println("Hello Developer!!!");
	}

// Greet user is a non static method
	public void greetuser() {
		System.out.println("Greeting user!!!");
	}
}
