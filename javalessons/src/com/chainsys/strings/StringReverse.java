package com.chainsys.strings;

/**
 * Author - ChainSys-Omkumar
 * Date - 28 Mar 2022
 */
import java.util.Scanner;

public class StringReverse {
	
	public static void reversee()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a sentence");
		String first= sc.nextLine();
		String sentence ="";
		try {
			sentence=sc.nextLine();
		}
		finally {
			sc.close();
		}
		for(int i=first.length()-1;i>=0;i--)
		{
			sentence=sentence+first.charAt(i);
		}
		System.out.println(sentence);
	}
}
