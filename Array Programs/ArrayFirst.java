import java.util.*;
public class ArrayFirst
{
	public static void main(String x[])
	{
	  int a[];//declaration or reference variable of array
	  a = new int[5]; //allocated memory for array.
	  Scanner xyz = new Scanner(System.in);
	  System.out.println("Enter a Array values \n");
	  for(int i=0;i<a.length;i++)
	  {
		a[i]= xyz.nextInt(); //store values in array 
	  }
	  System.out.println("Display Array values \n");
	  for(int i=0;i<a.length;i++)
	  {
		System.out.printf("%d\t",a[i]); //Display values.
	  }
	}
}
