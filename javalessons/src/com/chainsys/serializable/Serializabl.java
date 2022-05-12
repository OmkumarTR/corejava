package com.chainsys.serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializabl implements Serializable{
	int id;
	String name;
	public Serializabl (int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) throws IOException {
	Serializabl s1= new Serializabl(3118, "Vairakiyam");
	
	FileOutputStream fout= new FileOutputStream("D:\\Omkummar.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	
	out.writeObject(s1);
	out.flush();
	System.out.println("Success");
	}
}
	
