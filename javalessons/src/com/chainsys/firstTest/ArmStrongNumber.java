package com.chainsys.firstTest;
/**
 * Author - omku3118-Omkumar


 * Date   - 30-03-2022
 * 
 * Question: Solve the following
 * a. Get a three digit input number from the user
 * b. Split the number as individual digits
 * c. Cube each individual digit
 * d. Add the cube of each digit
 * e.Compare the total of each cubes with the input data and print "Same as input number" or "Different Number"
 */
import java.util.Scanner;

public class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		armstrong();
	}
	public static void armstrong()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three digit number");
		int value = sc.nextInt();
		sc.close();
		int a = value / 100;
		int b = value % 100;
		int l = b / 10;
		int c = value % 100;
		int z = c % 10;

		int temp = ((a * a * a) + (l * l * l) + (z * z * z));
		if (temp == value) 
		{
			System.out.println("Same as Input Number");
		} else 
		{
			System.out.println("Different Number");
		}
	}
}
