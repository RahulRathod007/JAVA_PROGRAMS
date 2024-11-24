//WAP to enter the 10 element array and print the occurrence of every element? 
import java.util.*;
public class OccurrenceElementArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[10];
		int count;
		System.out.println("\n Enter a values in array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array values \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		System.out.println("\nAfter a sorting array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		// Occurrence element logic.
		System.out.println("\nOccurrence Elements in array \n");
		for(int i=0;i<a.length;i++)
		{	count=1;
			if(i<a.length-1 && a[i] ==a[i+1])
			{   while(a[i] ==a[i+1])
				{ 
					count++;
					i++;
				}
			}
			System.out.printf("\n\n%d--->%d",a[i],count);
		}
	}
}