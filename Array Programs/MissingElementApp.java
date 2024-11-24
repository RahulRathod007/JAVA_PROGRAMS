//Write a program to find the smallest missing element from a sorted array? 
import java.util.*;
public class MissingElementApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int [5];
		System.out.println("\n enter array values \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("\n Display Array values \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		int flag=0;
		System.out.println("\nSmallest missing element is\n");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.printf("%d\t",j);
				flag=1;
				break; // remove this print all remaning missing element
				
			}
			if(flag==1)
			{
				break; // remove this print all remaning missing element
			}
		}
	}
}
