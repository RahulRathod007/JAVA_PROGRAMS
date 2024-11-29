/*
BufferedWriter class
________________________________________________________________________
BufferedWriter class is used for write data in new file on new line and BufferedWrite contain method name as newLine() which help us to add new line in file
*/
import java.io.*;
import java.util.*;
public class BuffterWriterApp
{
	public static void main(String x[]) throws Exception
	{
		FileWriter fw = new FileWriter("G:\\c program tech hub\\java\\iostream or filehandling\\emp.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner xyz = new Scanner (System.in);
		String data = xyz.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		System.out.println("Data Save Success.....");
		fw.close();
	}
}