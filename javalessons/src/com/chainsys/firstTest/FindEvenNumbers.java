package com.chainsys.firstTest;
/**
 /* Author - omku3118 - Omkumar
 * Date   - 30-03-2022
 * Question :Find the even digits in the given number. 1546903 
 */
import java.util.Scanner;

public class FindEvenNumbers {

	public static void main(String[] args) 
	{
		findEvenNumbers();
	}
		public static void findEvenNumbers() {
		
			long value=1546903;
			System.out.println("Input is  " +value);
			System.out.println();
			long num = value;
			long reminder = 0;
			while (num > 0) {
				reminder = num % 10;
				if (reminder % 2 == 0) {
					System.out.println("Even Number is : " +reminder);
				}
				num = num / 10;
			}
	}

}
