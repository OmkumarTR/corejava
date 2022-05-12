package com.chainsys.arrays;

public class ArraySolutions {

	public static void main(String [] args)
	{
		//float nums[]= {10.1f,23.4f,45.6f,23.7f,34.3f};
		//findSumandAverageofaFloatArray(nums);
		bubbleSort();
	}
	public static void findSumandAverageofaFloatArray(float[] nums) 
	{
		double result=0;
		int count=nums.length;
		for(int i=0;i<count;i++)
		{
			System.out.println(nums[i]+ ",");
		}
		System.out.println();
		for(int i=0;i<count;i++)
		{
			result=result+nums[i];
		}
		System.out.println("Sum     = :" +result);
		System.out.println("Average = :"+result);
	}
	public static void findtheLargestNumberArray(float[] nums) 
	{
		//Write code to find the largest number
	
		double result=nums[0];
		int count=nums.length;
		for(int i=0;i<count;i++)
		{
			if(result<nums[i])result=nums[i];
		}
		System.out.println("The Largest No : "+result);
}
	public static void bubbleSort()
	{
		int[]nos = {11,29,100,300,12,14,16,18,500};
		System.out.println("Original Values");
		
		for(int index=0;index<nos.length;index++)
		{
			System.out.println(nos[index]+",");
		}
		System.out.println();
		int count=nos.length;
		int temp=0;
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<(count-1);j++)
			{
				if(nos[j+1]<nos[j])
				{
					temp=nos[j];
					nos[j]=nos[j+1];
					nos[j+1]=temp;
					temp=0;
				}
			}
		}
		System.out.println("Values after SORT");
		for(int index=0;index<nos.length;index++)
		{
			System.out.println(nos[index]+",");
		}
	}
	}

