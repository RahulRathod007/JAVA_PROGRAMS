import java.io.*;
public class FileInputStreamApp
{
	public static void main(String x[])throws Exception
	{
		FileInputStream fin = new FileInputStream ("G:\\c program tech hub\\java\\iostream or filehandling\\Stream.txt");
		int data;
		
		while((data = fin.read())!=-1)
		{
			char ch = (char)data;
			System.out.print(ch);
		}
	}
}