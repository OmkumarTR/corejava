package com.chainsys.firstTest;
/**
 * Author - omku3118 - Omkumar
 * Date   - 30-03-2022
 * Question:How will you check if the input name contains only alphabets and the 
 * 			length of the name is not less than 8 characters
 */
import java.util.Scanner;
public class CheckVariables {
	public static void main(String[] args) {
		CheckAlphates();
	}
	public static void CheckAlphates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String name = sc.nextLine();
		sc.close();

		String nameinCase = name.toUpperCase();
		char[] ch = nameinCase.toCharArray();
		int lengthofch =ch.length;
		int ascii = 0;
		for (int index = 0; index < lengthofch; index++) {
			ascii = (int) ch[index];
		}
		if (lengthofch < 8) 
		{
			System.out.println("Input must be more than 8 characters");
			return;
		}
		if ((ascii >= 65) || (90 <= ascii)&&(ascii>=97)||(ascii<=122)) 
		{
			System.out.println("Input contains Only Alphabets");	
		} 
		else 
		{
			System.out.println("Only Allow for Alphates");
		}
	}
}
