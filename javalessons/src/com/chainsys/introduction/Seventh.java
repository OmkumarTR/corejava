package com.chainsys.introduction;

import java.util.Scanner;

public class Seventh {
	public static void main(String[] args) 
	{
		UserName();
	}
	public static String UserName() {
		Scanner sc = new Scanner(System.in); // Input Stream
		// Prompt a message in the display console
		System.out.println("Enter your name");
		// Get name from the keyboard input device and store the name in a local variable
		String username = sc.nextLine();
		sc.close(); // Closing the input Stream
		// Streams are created and managed by the OS.Scanner is just a handle
		
		System.out.println("Name is" + username); // Display the input value
		char[] nameAsCharacters = username.toCharArray();
		int lengthofCharArray = nameAsCharacters.length;
		
		if (lengthofCharArray < 9) {
			System.out.println("Name must have atleast 3 characters");
			return "Name ";
		}
		// ASCII value for alphatets is 65 to 90 for UPPER CASE
		String nameinuppercase = username.toUpperCase();
		// remove blank space before and after the name
		nameinuppercase = nameinuppercase.trim();

		char[] uppercaseCharArray = nameinuppercase.toCharArray();
		lengthofCharArray = uppercaseCharArray.length;
		int c = 0;

		for (int index = 0; index < lengthofCharArray; index++) {
			c = (int) uppercaseCharArray[index];

			if ((c >= 65 && c <= 90) && !(c >= 97 && c <= 122)) {
				System.out.println("alphates");
			
				}
			}
		return"Not alphates";
		}
	}

