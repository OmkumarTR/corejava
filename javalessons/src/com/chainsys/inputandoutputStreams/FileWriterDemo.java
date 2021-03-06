package com.chainsys.inputandoutputStreams;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
	Scanner scanner=new Scanner(System.in);
	String fname="";
	String source="";
	try
	{
		System.out.println("Enter filename with full path");
		fname=scanner.nextLine();
		System.out.println("Enter Data");
		source=scanner.nextLine();
	}
	finally
	{
		scanner.close();
	}
	char buffer[]= new char[source.length()];
	source.getChars(0, source.length(), buffer, 0);
	FileWriter fw=null;
	try
	{
		fw=new FileWriter(fname);
		for(int i=0;i<buffer.length;i++)
		{
			fw.write(buffer[i]);
		}
		System.out.println("Data saved");
	}
	catch(Exception err)
	{
		err.printStackTrace();
	}
	finally
	{
		fw.close();
	}
	}
}
