//Write a program to merge two arrays of same size sorted in decending order. 
import java.util.*;
public class MergeArrayApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner (System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		
		System.out.println("\n Enter a First Array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("\n Enter a second array \n");
		for(int i=0;i<b.length;i++)
		{
			b[i] = xyz.nextInt();
		}
		System.out.println("\n Display first array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("\n Display Second Array \n");
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("%d\t",b[i]);
		}
		int length = a.length+b.length;
		int c[] = new int[length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k] = a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k] = b[i];
			k++;
		}
		System.out.println("\n 	Merged Array \n");
		for(int i=0;i<c.length;i++)
		{
			System.out.printf("%d\t",c[i]);
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
					if(c[i]<c[j])
					{
						int temp = c[i] ;
						c[i] = c[j];
						c[j] = temp;
					}
			}
		}
		System.out.println("\n After Deccending Array \n");
		for(int i=0;i<c.length;i++)
		{
			System.out.printf("%d\t",c[i]);
		}
	}
}