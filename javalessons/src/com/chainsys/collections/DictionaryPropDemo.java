package com.chainsys.collections;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class DictionaryPropDemo {

	public static void main(String[] args) {
		
		Properties capitals= new Properties();
		Set<Object> states;
		String str;
		capitals.put("Madurai", "SpringField");
		capitals.put("Dindugal", "Tallahassee");
		capitals.put("Trichy", "Jefferson City");
		capitals.put("Villupuram", "Olympia");
		capitals.put("Chengalpattu", "Sacramento");
		capitals.put("Chennai", "IndianPolis ");
		states=capitals.keySet();			// Get set view of Keys
		Iterator<Object> itr=states.iterator();
		while(itr.hasNext())
		{
			str=(String)itr.next();
			System.out.println("The Capital of  "+str+ " is "+capitals.getProperty(str)+".");
		}
		// Look for state not in list -- Specify default
		str =capitals.getProperty("Madura", "Not Found");
		//str = capitals.getProperty("Chennai");
		System.out.println("The Capital of Madura is ::"+str);
	}
}
