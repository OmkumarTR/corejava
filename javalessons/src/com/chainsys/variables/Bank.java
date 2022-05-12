package com.chainsys.variables;
/**
 * Author Chainsys-Omkumar
 * Created on 25-03-2022
 */
import java.util.Scanner;

public class Bank {

	public static int curentBalance=500;
	public static String customerName;
	public static long accountnumber;
	
	public static void deposit(int paraAmount) 
	{
		curentBalance=curentBalance+paraAmount;	
	}
	public static int withdraw(int paraAmount)
	{
		curentBalance=curentBalance-paraAmount;
		return paraAmount;
	}
	
	public static void openAccount(String paraName ,long paraAccountNumber)
	{
		customerName=paraName;
		accountnumber=paraAccountNumber;
	}
}
