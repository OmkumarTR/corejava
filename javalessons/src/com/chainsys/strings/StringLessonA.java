package com.chainsys.strings;

import java.util.Scanner;

public class StringLessonA {

	public static void lessonOne() {
		String firstString = "Chainsys";
		System.out.println(firstString);
		char dataone[] = { 'c', 'h', 'a', 'i', 'n' };
		String secondString = new String(dataone);
		System.out.println(secondString);
		String thirdString = new String(new char[] { 'c', 'h', 'a', 'i', 'n' });
		System.out.println(thirdString);
	}

	public static void lessontwo() {
		String firstString = "Hello";
		String secondString = "Hello";
		String thirdString = "Hello";
		int firstnumber = 100;
		int secondnumber = 200;
		int thirdnumber = 300;
		System.out.println(firstnumber);
		System.out.println(secondnumber);

		firstString = "Welcome";
		System.out.println(firstString);
		System.out.println(secondString);
	}

	public static void creatingStringForLoop() {
		for (int count = 0; count < 10; count++) {
			String s1 = "Hello";
			System.out.println(count);
		}

	}

	public static void stringToCharArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");

		String firstString = sc.nextLine();
		sc.close();
		int stringLength = firstString.length();

		System.out.println("Lenght " + stringLength);
		char[] data = firstString.toCharArray();
		int dataarraylength = data.length;

		System.out.println("Lenght is " + dataarraylength);

	}

	public static void stringToUpperLower() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");

		String firstString = sc.nextLine();
		sc.close();

		System.out.println(firstString);
		String stringInUppercase = firstString.toUpperCase();

		System.out.println("to upper case is " + stringInUppercase);

		System.out.println("s1 = " + firstString);

		String stringLowerCase = firstString.toLowerCase();

		System.out.println("Lower case is " + stringLowerCase);
		System.out.println("s1 = " + firstString);
		
		// substring
		// From the 4 th char till end
		String substring = firstString.substring(3);
		
		System.out.println(substring);
		
		// from 3rd char to 6 th char (i.e. Excluding 7 th char)
		
		substring =firstString.substring(2,6);
		
		System.out.println(substring);
		
		// Replace
		
		String replaceString = firstString.replace('a','e');
		
		System.out.println(replaceString);
		
		// Equals
		
		boolean flag1 = firstString.equals(stringInUppercase);   // False
		System.out.println(flag1);
		
		// equals ignore case
		boolean flag = firstString.equalsIgnoreCase(stringInUppercase);    // True
		System.out.println(flag);
		
	}
	
	public static void testStringTrim()
	{
		String secondString ="Hope  it  rain   ";
		System.out.println("Before trim is " +secondString.length());
		
		secondString=secondString.trim();
		
		System.out.println("After trim is "+ secondString.length());
	}
	
	public static void testSplit()
	{
		String firstString = "  Tom and jerry are good friends";
		String trimmedString = firstString.trim();
		String [] data = trimmedString.split(" ");
		
		int count = data.length;
		
		System.out.println("Word count is " + count);
		
		for (int index=0; index<count; index++)
		{
			System.out.println(data[index]);
		}
	}
		
		public static void testSplitDays()
		{
			String weekdays = "Mon;Tue;Wed;Thu;Fri;Sat;Sun";
			String [] data = weekdays.split(",");
			
			int count = data.length;
			
			System.out.println("Days count is " + count);
			
			for (int index=0; index<count; index++)
			{
				System.out.println(data[index]);
			}
		}
		

		public static void reverse()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a sentence");
			String first= "";
			String sentence ="";
			try {
				sentence=sc.nextLine();
			}
			finally {
				sc.close();
			}
			for(int i=sentence.length()-1;i>=0;i--)
			{
				first=first+sentence.charAt(i);
			}
			System.out.println(first);
		}
		
		public static void verifyString(String s1)
		{
			if(null==s1)
			{
				System.out.println("String is Null");
				return;
			}
			else
			{
				System.out.println("String is NOT Null is =" + s1);
			}
			if(!s1.isEmpty()) {
				System.out.println("\t Not empty is = " +s1);
			}
			else
			{
			System.out.println("\t String is Empty");	
			}
				
			
		}
	}

