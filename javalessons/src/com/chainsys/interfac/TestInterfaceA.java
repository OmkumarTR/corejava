package com.chainsys.interfac;

public class TestInterfaceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA.echo();
        InterfaceA a1=new ExpliciteImplementor();
        a1.print();
        a1.print("Hello");
	}

}
