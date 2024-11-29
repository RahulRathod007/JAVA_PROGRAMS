//WAP to input number and calculate its factorial using Scanner.
import java.util.*;
public class FactApp
{
	public static void main(String x[])
	{
	  int no,f=1;
	  Scanner xyz = new Scanner(System.in);
	  System.out.println("\n enter a number \n");
	  no = xyz.nextInt();
	  for(int i=1;i<=no;i++)
	  {
		f = f * i;
	  }
	  System.out.printf("factorial is %d",f);
	}
}
