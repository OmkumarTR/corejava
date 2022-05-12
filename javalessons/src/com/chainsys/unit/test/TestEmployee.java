package com.chainsys.unit.test;

import com.chainsys.classesmethods.Employee;
import com.chainsys.variables.Bank;
import com.chainsys.variables.Calculator;

public class TestEmployee {

	public static void testEmpName() 
	{
		Employee firstEmployee=new Employee(1234);
		firstEmployee.setName("Omkumar");
		System.out.println(firstEmployee.getName());	
	}
	public static void testCity()
	{
		Employee firstEmployee=new Employee(1234);
		firstEmployee.setCity("Chennai");
		System.out.println(firstEmployee.getCity());
	}
	public static void testSalary()
	{
		Employee firstEmployee=new Employee(1234);
		firstEmployee.setSalary(10000);
		System.out.println(firstEmployee.getSalary());
		
	}
}
