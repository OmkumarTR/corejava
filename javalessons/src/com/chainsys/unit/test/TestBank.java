package com.chainsys.unit.test;
/**
 * Author Chainsys-Omkumar
 * Created on 25-03-2022
 */
import com.chainsys.variables.Bank;

public class TestBank 
{
	public static void testDeposit() 
	{
		System.out.println("Method : Deposit ");
		System.out.println("Before Current Balance is :"+ Bank.curentBalance);
		Bank.deposit(5000);
		System.out.println("After Current Balance is  :"+Bank.curentBalance);
		System.out.println();
	}
	public static void testWithdraw()
	{
		System.out.println("Method : Withdraw");
		System.out.println("Current Balance is :"+ Bank.curentBalance);
		int withdraw = Bank.withdraw(2000);
		System.out.println("Withdraw Amount is :"+ withdraw);
		System.out.println("Current Balance is :" +Bank.curentBalance);
		System.out.println();
	}
	public static void testOpenAccount() {
		Bank.openAccount("T R Omkumar", 6568833331L);;
		System.out.println("Account Holder name is :"+Bank.customerName);
		System.out.println("Account Number is      : "+Bank.accountnumber);
	}
}
