package com.chainsys.garbageCollections;

public class TestGarbage {
	
	public void finalize ()
	{
		System.out.println("Object is garbage collected");
	}

	public static void main(String[] args) 
	{
		TestGarbage s1 = new TestGarbage();
		
		s1=null;
		
		System.gc();
	

	}

}
