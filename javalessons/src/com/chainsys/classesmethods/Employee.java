package com.chainsys.classesmethods;
/**
 * This is a class contains employee related data
 * This person has id,name,city,and salary properties
 * @author omku3118
 * Created on 25 Mar 2022
 */
public class Employee {
	 private final int empID ;
	 private String name;
	 private String city;
	 private long salary;
	 
	 //Constructor
	 
	 public Employee (int id)
	 {
		 // Assigning value to read only field
		 
		 this.empID=id;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public int getEmpID()
	 {
		 return empID;
	 }
	 public String getCity()
	 {
		 return city;
	 }
	 public void setCity(String city)
	 {
		 this.city=city;
	 }
	 public void setSalary(long salary)
	 {
		 this.salary=salary;
	 }
	 public long getSalary()
	 {
		 return salary;
	 }
	 
	
}
