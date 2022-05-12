package com.chainsys.introduction;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		taskA();
		taskB();
		taskC();
	}

	public static void taskA() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();

	
		System.out.println(name);
	}

	public static void taskB() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = sc.nextInt();
		int result = number * 100;

	
		System.out.println(result);
	}
	public static void taskC() {
		String s1="100";
		String s2="25";
		
		System.out.println(s1+s2);
		int x= Integer.parseInt(s1);
		int y= Integer.parseInt(s2);
		
		int z=x+y;
		System.out.println(z);
	}
	public static void taskD() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.close();
		if (age<0) {
			System.out.println("Invalid age!!!");
		}
		if(age<18) {
			System.out.println("Sorry!!!You need to wait to get DL");
		}
		else {
			System.out.println("Happy biking...");
		}
	}
}
