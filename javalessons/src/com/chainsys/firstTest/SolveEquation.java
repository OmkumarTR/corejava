package com.chainsys.firstTest;
/**
 * @author omku3118 - Omkumar
 * Date - 30-03-2022
 * Question :
 * Solve the equation 2x2 + x + 5 for all numbers between 5 and 10 for x.
 */
public class SolveEquation 
{

	public static void main(String[] args) 
	{
		solve();
	}
	public static void solve() 
	{
	{
		for (int count = 5; count <= 10; count++) {
		long equation = ((2 * (count * count)) + count + 5);
		System.out.println("Number = " + count +" " +"Equation =" + equation);
	}
	}
	}
}
