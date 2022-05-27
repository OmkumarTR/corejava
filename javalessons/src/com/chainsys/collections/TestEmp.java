package com.chainsys.collections;

public class TestEmp {

	public static void main(String[] args) {
		
		Emp firstEmp = new Emp(111, null);
		Emp secondEmp = new Emp(411, null);
		
		System.out.println(firstEmp.hashCode());
		System.out.println(secondEmp.hashCode());
		
		boolean result=firstEmp.equals(secondEmp);
		System.out.println(result);
		System.out.println(firstEmp.getClass());
		
		result=firstEmp.equals(firstEmp);
		System.out.println(result);
		
		result=firstEmp.equals("Hello");
		System.out.println(result);
	}

}
