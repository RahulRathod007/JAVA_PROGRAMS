//Write a program to find the majority element of an array.
import java.util.*;
public class MajorityElement
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner (System.in);
		int a[] = new int [5];
		int mid = a.length/2;
		int count;
		System.out.println("\n Enter a array values \n");
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
		for(int i=0;i<a.length;i++)
		{	count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>mid)
			{
				System.out.println("The majority element Is "+a[i]);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("The majority element not");	
		}

	}
} 