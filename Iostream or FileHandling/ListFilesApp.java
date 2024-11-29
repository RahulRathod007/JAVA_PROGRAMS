/*
If we want to get all folders and file from particular path then we have method of File class name as 
listFiles() and this method return File class array.
Syntax: File ref []= File.listFiles();
*/
import java.io.*;
public class ListFilesApp
{
	public static void main(String x[])
	{
		File f = new File("G:\\c program tech hub\\java");
		File list[] = f.listFiles();
		
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	}
}