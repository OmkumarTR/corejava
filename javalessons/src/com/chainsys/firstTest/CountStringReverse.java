package com.chainsys.firstTest;

/**
 * Author - omku3118 - Omkumar

 * Date - 30-03-2022
 * Question :
 * String s2="Tom and Jerry are good friends"; 
 * 1. Write a function that can count the words in a string. 
 * 2. Write a function that can reverse the string 
 */
import java.util.Scanner;

public class CountStringReverse {

	public static void main(String[] args) {
		countwords();
		reverseString();
	}

	public static void countwords() {
		{
			String weekdays = "Tom and Jerry are good friends";
			String[] data = weekdays.split(" ");
			int count = data.length;
			System.out.println("Word count is " + count);
			for (int index = 0; index < count; index++) {
				System.out.print(data[index]);
			}
			System.out.println();
		}
	}

	public static void reverseString() {
		{
			String first = "Tom and jerry are good friends";
			String sentence = "";
			for (int i = first.length() - 1; i >= 0; i--) {
				sentence = sentence + first.charAt(i);
			}
			System.out.println();
			System.out.println("Reverse String  : " + sentence);
		}
	}
}
