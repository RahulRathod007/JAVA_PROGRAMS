/*boolean isFile(): this function check return path is file or not if path contain file return true otherwise false. 
-----------------------------------
FETCH FILE ONLY.
*/
import java.io.*;
public class FetchFileOnly
{
	public static void main(String x[])
	{
		File f = new File("G:\\c program tech hub\\java");
		File list[] = f.listFiles();
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
			{
				System.out.println(list[i]);
			}
		}
	}
}