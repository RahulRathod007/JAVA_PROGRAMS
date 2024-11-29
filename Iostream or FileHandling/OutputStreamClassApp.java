import java.io.*;
import java.util.*;
public class OutputStreamClassApp
{
	public static void main(String x[])throws Exception
	{
		FileOutputStream fout = new FileOutputStream("G:\\c program tech hub\\java\\iostream or filehandling\\Stream.txt",true);
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Data Here....");
		String data = xyz.nextLine();
		byte b[] = data.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Data Save Success.....");
	}
}