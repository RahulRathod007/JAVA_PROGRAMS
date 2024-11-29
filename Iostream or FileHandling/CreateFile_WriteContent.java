//Write a Java program to create a file and write contents, save and close the file.
import java.io.*;
import java.util.*;
public class CreateFile_WriteContent
{
	public static void main(String x[])throws Exception
	{
		File f = new File("G:\\c program tech hub\\java\\iostream or filehandling\\Practical.txt");
		boolean b = f.createNewFile();
		
		// if(b)
		// {
			// System.out.println("File Created Successfully.....");
		// }
		// else
		// {
			// System.out.println("You hava Already Created File.....");
		// }
		
		FileWriter fw = new FileWriter("G:\\c program tech hub\\java\\iostream or filehandling\\Practical.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner xyz = new Scanner(System.in);
		String data = xyz.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		System.out.println("Data Save Sucess.....");
		fw.close();
	}
}