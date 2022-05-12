package com.chainsys.inputandoutputStreams;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInputRead {
	public static void main(String[] args) throws IOException {
		char c;
		InputStreamReader sr=new InputStreamReader(System.in);
		System.out.println("Enter characters, 'q' to quit ");
		do
		{
			c=(char) sr.read();
			System.out.print(c);
		}
		while(c!='q');
	}
}
