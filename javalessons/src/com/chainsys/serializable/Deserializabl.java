package com.chainsys.serializable;

import java.io.*;

public class Deserializabl {

	public static void main(String[] args) throws Exception {
	
		ObjectInputStream input = new ObjectInputStream(new FileInputStream ("D:\\Omkummar.txt")); 
		Serializabl s=(Serializabl)input.readObject();
		
		System.out.println(s.id+ " "+s.name);
		
		input.close();
			

	}

}
