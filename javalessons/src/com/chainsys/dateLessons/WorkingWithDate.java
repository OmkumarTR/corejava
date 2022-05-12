package com.chainsys.dateLessons;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class WorkingWithDate {
	
	public static void main(String[] args)
	{
		displayCurrentDate();
	}
	public static void displayCurrentDate()
	{
		Calendar vCalender=Calendar.getInstance();
		Date date=vCalender.getTime();
		
		System.out.println(date);
		
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MMM-dd");
		
		System.out.println(dateFormat.format(date));
	}
	
	public static void displayDOB() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your DOB");
		String dob = sc.nextLine();
		sc.close();
		int year=Integer.parseInt(dob.substring(0, 4));
		int month = Integer.parseInt(dob.substring(5, 7))-1;
		int day=Integer.parseInt(dob.substring(8, 10));
		
		System.out.println(year + "-"+month+"-"+day);
		
		Calendar date = new GregorianCalendar(year,month,day);
		Date dl= date.getTime();
		SimpleDateFormat f1= new SimpleDateFormat("yyyy-MMM-dd");
		System.out.println("DOB :"+f1.format(dl));
		
		// Retirement date
		date.add(Calendar.YEAR, 60);
		date.add(Calendar.MONTH, 1);
		date.set(Calendar.DAY_OF_MONTH, 1);
		date.add(Calendar.DATE, -1);
		
		System.out.println("DOB :"+f1.format(date.getTime()));
		
		
		
	}
}
