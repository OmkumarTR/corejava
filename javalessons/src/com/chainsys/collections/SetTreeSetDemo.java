package com.chainsys.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSetDemo {

	public static void main(String[] args) 
	{
		demoA();
	}
	public static void demoA()
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Cut");
		ts.add("cut");
		ts.add("Fun");
		ts.add("Assam");
		ts.add("ball");
		ts.add("Dog");
		ts.add("Aag");
		ts.add("event");
	//	ts.add(null);
		ts.add("Delhi");
		ts.add("Carrot");
		ts.add("Ball");
		ts.add("Apple");
		ts.add("Boy");
		ts.add("egg");
		ts.add("Pool");
		System.out.println("Size :"+ts.size());
		Iterator <String>itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	

}
