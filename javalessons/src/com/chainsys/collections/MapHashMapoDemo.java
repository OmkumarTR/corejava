package com.chainsys.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapHashMapoDemo {

	public static void main(String[] args) {
		usingGenericMapDemoA();

	}
	public static void usingGenericMapDemoA()
	{
        HashMap<String, String> secondMap=new HashMap<String, String> ();
        System.out.println("Size "+secondMap.size()); secondMap.put ("k1", "ABcd");
        secondMap.put ("k2", "ABcd"); secondMap.put ("k3", "ABcd");
        secondMap.put ("k4", "ABcd"); System.out.println("Size "+secondMap.size());
        Set<Map.Entry<String, String>> setofMapEntry = secondMap.entrySet ();
        Iterator<Map.Entry<String, String>> mapIterator = setofMapEntry.iterator ();
        while (mapIterator.hasNext ())
        {
        Map.Entry<String, String> mapEntry =
        (Map.Entry<String, String>) mapIterator.next(); 
        System.out.print (mapEntry.getKey() + ": ");
        System.out.println (mapEntry.getValue () );
        }
	}
	public static void usingTreeMap()
	{
		TreeMap<String,Double> tm=new TreeMap<String,Double>();
		tm.put("John Doe", 3434.43);
		tm.put("Tom Smith", 3434.43);
		tm.put("Jane Baker", 3434.43);
		tm.put("Tod Hall", 3434.43);
		tm.put("Ralph Smith", 3434.43);
		
		Set<Map.Entry<String, Double>>set=tm.entrySet();
		Iterator<Map.Entry<String, Double>> i =set.iterator();
		while(i.hasNext())
		{
			Map.Entry<String, Double> me=i.next();
			System.out.println(me.getKey()+" ");
			System.out.println(me.getValue());
		}
		// Deposit 1000 into John Doe's Account
		double balance = tm.get("John Doe");
		tm.put("John Doe", (balance +1000));
		System.out.println("John Doe's new balance:"+tm.get ("John Doe"));
	}
}
