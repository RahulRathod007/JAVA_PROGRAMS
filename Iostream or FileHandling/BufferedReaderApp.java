/*so if we read complete line or statement from file at time we have new class name as BufferedReader class.
BufferedReader class contain readLine() method which is used for read complete line at time from file.
*/

import java.io.*;
public class BufferedReaderApp
{
	public static void main(String x[])throws Exception
	{
		FileReader  fr = new FileReader("G:\\c program tech hub\\java\\iostream or filehandling\\emp.txt");
		BufferedReader br = new BufferedReader(fr);
		String data;
		
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
			Thread.sleep(1000);
		}
		
		System.out.print(data);
	}
}