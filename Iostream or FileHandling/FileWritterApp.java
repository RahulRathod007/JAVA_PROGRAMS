import java.io.*;
import java.util.*;
public class FileWritterApp
{
	public static void main(String x[])throws Exception
	{
		FileWriter fw = new FileWriter("G:\\c program tech hub\\java\\iostream or filehandling\\emp.txt",true);
		Scanner xyz = new Scanner (System.in);
		String data = xyz.nextLine();
		fw.write(data);  // when we write anything then it will override on previous data. which we have already written.
		System.out.println("Data Save Success....");
		fw.close();
	}
}