package com.chainsys.firstTest;
/*
 * Author - Omkumar
 * Date   - April 28 2022
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileOperation {
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter method case");
		int method=sc.nextInt();
		sc.close();
		switch(method)
		{
		case 1:
			System.out.println("Create File Method");
			createFile();
			break;
		case 2:
			System.out.println("Rename File Method");
			renameFile();
			break;
		case 3:
			System.out.println("Append to File using File Writer Method");
			AppendToFileUsingFileWriter();
			break;
		case 4:
			System.out.println("Modify File Method");
			modifyFile();
			break;	
		case 5:
			System.out.println("Read Data From File method");
			readDataFromFile();
			break;
		case 6:
			System.out.println("Delete file Method");
			deleteFile();
			break;
		case 7:
			System.out.println("Copy file Method");
			copyFile();
			break;
		case 8:
			System.out.println("Move file Method");
			moveFile();
			break;
		}
	}
	public static void createFile()
	{
	try {  
    // Creating an object of a file  
    File obj = new File("D:Omkumar.txt");   
      if (obj.createNewFile()) {  
      System.out.println("File " + obj.getName() + " is created successfully.");  
      } else {  
      System.out.println("File is already exist in the directory.");  
      }  
      } catch (IOException err) {  
      System.out.println("An unexpected error is occurred.");  
      err.printStackTrace();  
      }   
	}
	public static void renameFile()
	{
		// Create an object of the File class
        // Replace the file path with path of the directory
		try {
        File fil = new File("D:filename.txt");
  
        // Create an object of the File class
        // Replace the file path with path of the directory
        File rename = new File("D:renamefile.txt");
  
        // store the return value of renameTo() method in flag
        boolean flag = fil.renameTo(rename);
  
        // if renameTo() return true then if block is
        // executed
        if (flag == true) {
            System.out.println("File Successfully Rename");
        }
        // if renameTo() return false then else block is
        // executed
        else {
            System.out.println("Operation Failed");
        }
		}
		catch(Exception err)
		{
			System.out.println("Error "+err.getMessage());
		}
	}
		
	public static void AppendToFileUsingFileWriter()
	{
	try(FileWriter Append = new FileWriter("D:omkumar.txt", true);
		 BufferedWriter Appen = new BufferedWriter(Append);
		 PrintWriter obje = new PrintWriter(Appen))
		{
		obje.println("Be confident");  
		obje.println("Be truth, More happiness");
		System.out.println("Data added");
		} catch (IOException e) {
		}}
	public static void deleteFile()
	{
        String obj2 = "D:filename.txt";
        try {
            Files.delete(Paths.get(obj2));
            System.out.println("File Deleted");
        } catch (IOException e) {
            e.printStackTrace();
        }}
	public static void readDataFromFile() throws IOException
	{
		String obj3 = "D:omkumar.txt";
		File file = new File(obj3);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null){
		    //process the line
		    System.out.println(line);
		}
	}
	public static void copyFile() throws IOException
	{
	    {
	        FileInputStream fis = null;
	        FileOutputStream fos = null;
	        try {
	            fis = new FileInputStream(
	                "D:FileOperation.txt");
	            fos = new FileOutputStream(
	                "D:FileOperationoutput.txt");
	            int c;
	            while ((c = fis.read()) != -1) {
	                fos.write(c);
	            }
	            System.out.println(
	                "copied the file successfully");
	        }
	        finally {
	            if (fis != null) {
	                fis.close();
	            }
	            if (fos != null) {
	                fos.close();
	            }
	        }
	    }}
	public static void moveFile() throws IOException
    {
        File file = new File("D:FileOperationoutput.txt");
        // renaming the file and moving it to a new location
        if(file.renameTo
           (new File("D:\\temp\\FileOperation.txt")))
        {
            // if file copied successfully then delete the original file
            file.delete();
            System.out.println("File moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    }
        public static void modifyFile()throws IOException
        {
            String source = "D:\\FileOperatiggon.txt";
            Scanner sc = new Scanner(new File(source));
            StringBuffer buffer1 = new StringBuffer();
            while (sc.hasNextLine()) {
               buffer1.append(sc.nextLine()+System.lineSeparator());
            }
            String fileContents = buffer1.toString();
            System.out.println("Contents of the file: "+fileContents);
            sc.close();
            String oldLine = "omkumar";
            String newLine = "I am very bold,Sportive";
            fileContents = fileContents.replaceAll(oldLine, newLine);
            FileWriter writer = new FileWriter(source);
            System.out.println("");
            System.out.println("new data: "+fileContents);
            writer.append(fileContents);
            writer.flush();
        }
     }
    
	
	
	

