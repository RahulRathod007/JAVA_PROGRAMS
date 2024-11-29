//Method of FileReader class.
//by using  this we can read single character at a time.
import java.io.*;
public class FileReaderApp
{
	public static void main(String x[])throws Exception
	{
		FileReader fr = new FileReader("G:\\c program tech hub\\java\\iostream or filehandling\\emp.txt");
		int data;
		
		while((data=fr.read())!=-1)
		{
			System.out.print((char)data);
			Thread.sleep(100);
		}
		System.out.print(data);
	}
}