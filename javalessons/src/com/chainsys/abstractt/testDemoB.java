package com.chainsys.abstractt;

public class testDemoB {
	
	public static void main (String args [])
	{
		testDemoB();
	}
	public static void testDemoB() 
	{
		// abstract class can not be instantiated
//		AbsDemoB objectDemob=new AbsDemoB();
		AbsDemoB objectDemob = new DemoBChild();
		objectDemob.echo();
	}
}
