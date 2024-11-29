/*boolean isDirectory(): this function check return path is folder and if path is folder return true otherwise return false.
------------------------------------
FETCH ONLY FOLDERS.
*/
import java.io.*;
public class FetchOnlyFolders
{
	public static void main(String x[])
	{
		File f = new File("G:\\c program tech hub\\java");
		File list[]=f.listFiles();
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isDirectory())
			{
				System.out.println(list[i]);
			}
		}
	}
}