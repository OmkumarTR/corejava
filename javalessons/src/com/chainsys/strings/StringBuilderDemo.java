package com.chainsys.strings;

public class StringBuilderDemo 
{
	public static void testA()
	{
		String firstString ="Hello how are you today.Is the weather hot or cold.";
		
		StringBuilder stringbuilder = new StringBuilder();
		
		stringbuilder.ensureCapacity(250);
		
		System.out.println("Length is = "+stringbuilder.length());
		
		System.out.println("Capacity is = "+ stringbuilder.capacity());
		
		stringbuilder.append(firstString);
		
		System.out.println("Length is = "+stringbuilder.length());
		
		System.out.println("Capacity is = "+ stringbuilder.capacity());
		
		firstString="Wish it rains this week";
		
		stringbuilder.append(firstString);
		System.out.println("Buffer is = "+stringbuilder);
		System.out.println("Length is = "+stringbuilder.length());
		
		System.out.println("Capacity is = "+ stringbuilder.capacity());
		
		// Reduce capacity to length
		stringbuilder.trimToSize();
		System.out.println("\t Length is = "+ stringbuilder.length());
		System.out.println("Capacity is = "+ stringbuilder.capacity());
		
		// Replace 
		stringbuilder.replace(3, 8, "--This is a Test--");
		System.out.println("Replace is ="+stringbuilder);
		
		// Insert
		stringbuilder.insert(10, "--This is August--");
		System.out.println("Insert is = "+stringbuilder);
		System.out.println("\t Length is = "+ stringbuilder.length());
		System.out.println("Capacity is = "+ stringbuilder.capacity());
		
		//Delete
		stringbuilder.delete(5, 20);
		System.out.println("Delete is = "+stringbuilder);
		System.out.println("\t Length is = "+ stringbuilder.length());
		System.out.println("\t Capacity is = "+ stringbuilder.capacity());
		
		// Reverse
		System.out.println("Before reverse : "+stringbuilder);
		stringbuilder.reverse();
		System.out.println("After reverse : "+stringbuilder);
		
	}
}
