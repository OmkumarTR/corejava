package com.chainsys.introduction;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = sc.nextLine();
		sc.close();
		System.out.println("Output: " + checkAlphates(input));
	}

	public static String checkAlphates(String input) {
		if (input == null) {
			return "Enter input";
		}

		for (int i = 0; i < input.length(); i++) {

			int c = input.charAt(i);
			if (!(c >= 65 && c <= 90) && !(c >= 97 && c <= 122)) {
				return "Input name contains not alphates";
			}
		}
		return "Input name contains only alphates";
	}

}
