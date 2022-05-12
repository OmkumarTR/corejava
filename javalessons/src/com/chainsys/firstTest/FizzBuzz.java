package com.chainsys.firstTest;
/**
 * @author - omku3118 - Omkumar
 * Date    - 30-03-2022
 * Question : Write a program that prints the number form 1 to 100.But for multiples of three print "Fizz"
 * 			  instead of the number and for the multiples of five print "Buzz"
 * 			  For numbers which are multiples of both three and five print "FizzBuzz".
 */
public class FizzBuzz {
	public static void main(String[] args) {
		fizzbuzz();
	}
	public static void fizzbuzz()
	{
		int n = 100;
// loop for 100 times
        for (int i=1; i<=n; i++)                                
        {
//number divisible by 15(divisible by both 3 & 5), print 'FizzBuzz' in place of the number
         if (i%15==0)   
         System.out.print("FizzBuzz"+" ");
// number divisible by 5, print 'Buzz'in place of the number
         else if (i%5==0)    
         System.out.print("Buzz"+" ");
// number divisible by 3, print 'Fizz'in place of the number
         else if (i%3==0)    
         System.out.print("Fizz"+" ");
// print the numbers                 
         else 
          System.out.print(i+" ");                        
        }
    }
	}

