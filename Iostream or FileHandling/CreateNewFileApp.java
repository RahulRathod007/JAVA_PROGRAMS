/*
How to create file using File class
_____________________________________________________________________
If we want to create file using File class we have method 
boolean createNewFile(): this method create new file and if file created successfully return true otherwise return false.
*/

import java.io.*;
public class CreateNewFileApp
{
	public static void main(String x[])throws IOException
	{
		File f = new File("G:\\c program tech hub\\java\\iostream or filehandling\\emp.txt");
		boolean b = f.createNewFile();
		
		if(b)
		{
			System.out.println("File Created SuccessFully ");
		}
		else
		{
			System.out.println("Some Problem is there...");
		}
		
	}
}