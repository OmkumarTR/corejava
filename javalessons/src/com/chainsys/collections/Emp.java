package com.chainsys.collections;

import java.io.Serializable;

public class Emp implements Serializable{

	private final int Id;
	public String Name;
	
	public Emp(int vl, String sName)
	{
		Id=vl;
		Name=sName;
	}
	public double getID()
	{
		return Id;
	}
//	public String getName()
//	{
//		return Name;
//	}
	@Override
	public boolean equals(Object obj)
	{
		Class cl= obj.getClass();
		boolean flag=false;
		if(cl==this.getClass())
		{
			Emp other=(Emp)obj;
			if(this.hashCode()==other.hashCode())
				flag=true;
		}
		return flag;
	}
	@Override
	public int hashCode()
	{
		return this.Id;
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
}


