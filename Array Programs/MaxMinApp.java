//WAP to create array of size 5 and find the max and min value from array?
import java.util.*;
public class MaxMinApp
{
	public static void main(String x[])
	{
	  Scanner xyz = new Scanner(System.in);
	  int len;
	  System.out.println("\n enter length of array \n");
	  len = xyz.nextInt();
	  int a[] = new int[len];
	  System.out.println("\n enter a array values \n");
	  for(int i=0;i<a.length;i++)
	  {
	    a[i]=xyz.nextInt();
	  }
	  System.out.println("\n Display Array values \n");
	  for(int i=0;i<a.length;i++)
	  {
		System.out.printf("%d\t",a[i]);
	  } 
	  int max = a[0];
	  for(int i=0;i<a.length;i++)
	  {
			if(a[i]>max)
			{
				max=a[i];
			}
	  }
	  int min = a[0];
	  for(int i=0;i<a.length;i++)
	  {
			if(a[i]<min)
			{
				min = a[i];
			}
	  }
	  System.out.println("\nMax is "+max);
	  System.out.println("\n\nMin is "+min);
	}
}