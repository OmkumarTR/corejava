package com.chainsys.usingfinal;

public class TestPrivateConstructor {
	
	public static void main (String [] args)
	{
		testPrivateConstructor();
	}
	public static void testPrivateConstructor() {
		ShapeAPrivateConstructor refShapeA=
		ShapeAPrivateConstructor.getObject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}
}
