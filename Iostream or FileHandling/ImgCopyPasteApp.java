//WAP for create image copy paste application.
import java.io.*;
import java.util.*;
public class ImgCopyPasteApp
{
    public static void main(String x[])throws Exception
	{
	       FileInputStream fr = new FileInputStream("G:\\C PROGRAM TECH HUB\\JAVA\\POJO CLASS\\img.jpg");
		   FileOutputStream fw = new FileOutputStream("G:\\C PROGRAM TECH HUB\\JAVA\\iostream or filehandling\\img.jpg");
		   int data;
		   while((data=fr.read())!=-1)
		   {
		      fw.write(data);
			  
		   }
		   fw.close();
		   fr.close();
		   System.out.println("File Save Successfully............");
	}
}
