package com.chainsys.firstTest;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "hjvhjma";
		String r = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if(s.equals(r))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
