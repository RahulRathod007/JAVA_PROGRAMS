//boolean  mkdir() : this method is used for create folder using File class and If folder created successfully return true otherwise return false.

import java.io.*;
public class CreateFolderApp
{
	public static void main(String x[])
	{
		File f = new File("G:\\C PROGRAM TECH HUB\\JAVA\\Iostream or FileHandling\\Created New Folder");
		boolean b = f.mkdir();
		
		if(b)
		{
			System.out.println("Folder Created SuccessFully ");
		}
		else
		{
			System.out.println("Some Problem is there...");
		}
	}
}