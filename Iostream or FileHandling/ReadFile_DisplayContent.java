//Write a Java  program to read file contents and display on console.

import java.io.*;
public class ReadFile_DisplayContent
{
	public static void main(String x[])throws Exception
	{
		FileReader fr = new FileReader("G:\\c program tech hub\\java\\iostream or filehandling\\Practical.txt");
		int data;
		
		while((data=fr.read())!=-1)
		{
			System.out.print((char)data);
			Thread.sleep(100);
		}
		System.out.print(data);
	}
}