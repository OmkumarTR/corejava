package com.chainsys.entrypoint;

import com.chainsys.unit.test.CalculatorTester;
import com.chainsys.unit.test.VariableTester;

/**
 * 
 * @author Venkat
 * Date 24-03-2022
 * Category Classroom lessons
 * Purpose : Entry point class for entire project
 */
public class StartUp {
	/**
	 * Purpose portable executable entry point for the lessons
	 * @param args
	 * @return void
	 */

	public static void main(String[] args) {
	
		//VariableTester.testGlobalVariables();
	//	VariableTester.testImmutableVariable();
		//VariableTester.testStaticMethod();
	//	VariableTester.testNonStaticMethod();
		CalculatorTester.Testadd();
	}

}
