package com.chainsys.firstTest;
/**
 * 
 * @author omku3118
 * Date - 30-03-2022
 */
public class Student {
	int Id;
	String dob;
	String bloodGroup;
	int height;
	int marks;
	public Student(int Id, String string, String bloodGroup, int height, int marks) {
		this.Id = Id;
		this.dob = string;
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.marks = marks;
	}
	public  void display() {
		System.out.println("Student id is    : "+Id);
		System.out.println("Date of birth is : "+dob);
		System.out.println("Blood Group is   : "+bloodGroup);
		System.out.println("height is        : "+height);
		System.out.println("Marks is         : "+marks);	
	}
	public static void main(String[] args) 
	{
		Student firstStudent =new Student(1,"20 Oct 1997","B+",180,90);
		firstStudent.display();
	}
}
