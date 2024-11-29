/*
Syntax: File ref [] = File.listRoots()
Methods related with drive details?
long getTotalSpace(): this method can return total space of drive in bits format.
long getFreeSpace(): this method can return free space of drive.
*/
import java.io.*;
public class GetDriveApp
{
	public static void main(String x[])
	{
		File f[] = File.listRoots();
		
		for(int i=0;i<f.length;i++)
		{
			long TotalSpace = f[i].getTotalSpace();
			long FreeSpace = f[i].getFreeSpace();
			System.out.println("Total Space = "+(TotalSpace)/1073741824 +"GB\t" +"Free Space = "+(FreeSpace)/1073741824 +"GB\t" +"Used Space = "+(TotalSpace-FreeSpace)/1073741824 +"GB");
		}
	}
}