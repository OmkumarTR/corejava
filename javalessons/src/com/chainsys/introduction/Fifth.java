package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {
		// printnumbersOneToHundred();
		//printnumbersTenToOne();
		//printMatrix();
		//printTriangle();
		printTriangleB();
	}
	public static void printnumbersOneToHundred() {
		int count = 0;
		for (count = 0; count <= 100; count++) {
			System.out.println(count + " ");
		}
	}
	public static void printnumbersTenToOne() {
	int count = 10;
		for (count = 10; count >= 1; count--) {
			System.out.println(count + " ");
		}
	}
	//Nested for loop
	public static void printMatrix() {
	int countA = 0;
		for (countA = 1; countA<=5; countA++) {
			for( int countB=1; countB<=10;countB++)
			{
				System.out.print(countB + " ");
			}
			System.out.println();
		}
	}
	public static void printTriangle() {
	int countA = 0;
		for (countA = 1; countA<=10; countA++) {
			for( int countB=1; countB<=countA;countB++)
			{
				System.out.print(countB + " ");
			}
			System.out.println();
		}
	}
	public static void printTriangleB() {
	int countA = 0;
		for (countA = 1; countA<=10; countA++) {
			for( int countB=1; countB<=countA;countB++)
			{
				System.out.print("");
				
			}
			for(int countC=countA;countC>=1;countC--)
			{
				System.out.print(countC);
			}
			System.out.println();
		}
	}
}
