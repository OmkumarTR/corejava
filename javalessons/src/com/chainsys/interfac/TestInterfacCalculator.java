package com.chainsys.interfac;

public class TestInterfacCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculator c = new Calci();
		
		int result=c.add(5, 4);
		System.out.println(result);
		result=c.multiply(5, 4);
		System.out.println(result);
		result=c.divide(5, 4);
		System.out.println(result);
		testMarker();
	}
	public static void testMarker()
	{
		ICalculator firstCalculator = new Calci();
		if(firstCalculator instanceof ICalculator )
		{
			ICalculator contract = firstCalculator;
			int output= 0;
			output=contract.add(10, 5);
			System.out.println(output);
			output=contract.multiply(10, 5);
			System.out.println(output);
			output=contract.divide(10, 5);
			System.out.println(output);
		}
		else
			System.out.println(firstCalculator.getClass().getName()+ "Does not implement I Calculator");
	}
}
