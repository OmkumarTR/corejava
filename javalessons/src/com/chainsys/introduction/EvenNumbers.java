package com.chainsys.introduction;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		 //EvenNumbers();
		 findEvenNumbers();
		//SwapNumbers();
	}

	public static void EvenNumbers() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void findEvenNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 digit number");
		long value = sc.nextLong();
		sc.close();

		long num = value;
		long reminder = 0;
		while (num > 0) {
			reminder = num % 10;
			if (reminder % 2 == 0) {
				System.out.println(reminder);
			}
			num = num / 10;
		}

	}

	public static void SwapNumbers() {
		int x = 62;
		int y = 26;
		System.out.println("x= " + x + " y= " + y);
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x= " + x + " y= " + y);
	}

}
