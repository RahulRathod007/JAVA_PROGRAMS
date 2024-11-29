import java.io.*;
import java.util.*;
public class Demo
{
	public static void main(String x[])throws Exception
	{
		FileReader fr = new FileReader("G:\\c program tech hub\\java\\iostream or filehandling\\Demo.txt");
		BufferedReader br = new BufferedReader(fr);
		String data;
		
		while((data = br.readLine())!=null)
		{
			System.out.println(data);
			Thread.sleep(1000);
		}
		System.out.println(data);
	}
}