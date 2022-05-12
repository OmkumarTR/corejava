package com.chainsys.introduction;

public class Sixth {

	public static void main(String[] args) 
	{
		printDiamond();
	}
	public static void printDiamond() 
	{
		for (int countA = 1; countA <= 9; countA++) 
		{
			for (int countB = 1; countB <= countA; countB++) 
			{
				System.out.print(countB);
			}
			System.out.println();
		}
		for (int countA = 9 - 1; countA >= 1; countA--) 
		{
			for (int countB = 1; countB <= countA; countB++) 
			{
				System.out.print(countB);
			}
			System.out.println();
		}
	}

}
