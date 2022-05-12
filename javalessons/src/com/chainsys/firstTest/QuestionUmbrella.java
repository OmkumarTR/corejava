package com.chainsys.firstTest;
/**
 * Author - omku3118
 * Date - 30-03-2022
 */
import java.util.Scanner;
public class QuestionUmbrella 
{
	public static void main(String[] args) {
		umbrella();
	}
	public static void umbrella()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter input");
	  String string1 =sc.nextLine();
	  if(string1.contains("rain"))
	  {
		  System.out.println("Get an Umbrella with you");
	  }
	  if(string1.contains("raining"))
	  {
	  System.out.println("Get an Umbrella with you");
	  }
	  else
	  {
		  System.out.println("There is no raining walk safely");
		  return;
	  }
	  System.out.println("Enter Today Temperature");
	  int temp =sc.nextInt();
	  sc.close();
	  
	  if (temp<32)
	  {
	  System.out.println("Bring a Heavy Jacket");  
	  }
	  else if((temp==32)&&(temp<50))
	  {
	  System.out.println("Bring a Light Jacket");   
	  }
	  else
	  {
	  System.out.println("There is no Use of Jacket");  
	  }
	}
	
	}

