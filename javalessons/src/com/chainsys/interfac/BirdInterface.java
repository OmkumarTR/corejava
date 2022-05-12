package com.chainsys.interfac;

public class BirdInterface implements InterfaceOne,InterfaceTwo,InterfaceThree {
	
public static void main(String []args)
{
	BirdInterface m= new BirdInterface();
	m.print();
	m.show();
	m.output();
}

@Override
public void output() {
	System.out.println("Output ");
	
}

@Override
public void show() {
	// TODO Auto-generated method stub
	
}

@Override
public void print() {
	// TODO Auto-generated method stub
	
}}
