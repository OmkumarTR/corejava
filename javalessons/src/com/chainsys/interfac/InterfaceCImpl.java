package com.chainsys.interfac;

	public class InterfaceCImpl implements InterfaceC {
		@Override
		public void m1() 
		{ 	
			System.out.println("M1 method is created");
		}

		@Override
		public void m2() 
		{
			System.out.println("M2 method is created");
		}

		@Override
		public void print() 
		{
			System.out.println("Print method is created");
		}

		@Override
		public void m3() {
		}

		@Override
		public void m4() {
		}

		@Override
		public void show() {
		}
	
		public static void main(String[] args) 
		{
			InterfaceA.echo();
			InterfaceA a1=new InterfaceCImpl();
			a1.print();
			a1.print("Hello");
		}
	}

