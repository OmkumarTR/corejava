package com.chainsys.inheritance;

public class Employee {

	int salary = 4000;
}

class Programmer extends Employee{
	int bonus =1000;
	
	public static void main(String[] args) {
	
	Programmer p = new Programmer();
	System.out.println("Salary is : "+p.salary);
	System.out.println("Bonus : "+p.bonus);

	}

}
