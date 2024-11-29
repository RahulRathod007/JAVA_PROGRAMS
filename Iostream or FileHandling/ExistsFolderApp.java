//boolean exists() : this method check whether path i.e file or folder exists on specified path if file or folder already present return true otherwise return false.

import java.io.*;
public class ExistsFolderApp
{
	public static void main(String x[])
	{
		File f = new File("G:\\C PROGRAM TECH HUB\\JAVA\\Iostream or FileHandling\\New Folder");
		boolean check = f.exists();
		if(check)
		{
			System.out.println("You Have Already Created Folder");
		}
		else
		{
			boolean b = f.mkdir();
			if(b)
			{
				System.out.println("Folder Created ");
			}
			else
			{
				System.out.println("Some Problem is there...");
			}
		}
	}
}