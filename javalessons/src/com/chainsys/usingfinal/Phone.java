package com.chainsys.usingfinal;

public class Phone {
	
	public void makeACall()
	{
		System.out.println("Call made...");
	}
	public final void sendSMS()
	{
		System.out.println("SMS Send ...");
	}
}
class Nokia extends Phone
{
	public void makeACall()
	{
		System.out.println("Call made from Nokia");
	}
}
// Override
//public void sendSMS()
//{
//	System.out.println("SMS Send ..");
//}