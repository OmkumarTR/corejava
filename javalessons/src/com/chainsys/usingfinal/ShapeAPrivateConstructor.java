package com.chainsys.usingfinal;

public class ShapeAPrivateConstructor {
	
	public int height;
	public int width;
	
	private ShapeAPrivateConstructor()
	{
		System.out.println("ShapeA CreatedA "+ hashCode());
	}
	private ShapeAPrivateConstructor(int x)
	{
		height=x=width=x;
		System.out.println(x+" Shape A created B"+hashCode());
	}
	public void echo ()
	{
		System.out.println("ShapeA Echo ...");
		System.out.println(height + " "+ width);
	}
	public static ShapeAPrivateConstructor getObject()  // Factory Method
	{
		return new ShapeAPrivateConstructor();			// Call to Private Constructor
	}
}
