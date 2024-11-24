//WAP to create array of size 5 and reverse it means shift value of its index
import java.util.*;
public class ReverseArrayApp
{
	public static void main(String x[])
	{
		int a[]= new int[5];
		Scanner xyz = new Scanner (System.in);
		System.out.println("\n enter a values in Array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("\n Before Reverse Array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		int first = a[0];
		int mid = a.length/2;
		int last = a.length-1;
		for(first=0; first<=mid ;first++)
		{
			int temp = a[first];
			a[first]=a[last];
			a[last]=temp;
			last--;
		}
		System.out.println("\n After Reverse Array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}