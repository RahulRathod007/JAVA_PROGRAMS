// Write a program in C to find a pair with given sum in the array.
import java.util.*;
public class PairSumArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("\n enter array values \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.printf("\n Display Array values \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		int sum;
		int flag=0;
		System.out.println("\n enter a sum \n");
		sum = xyz.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(sum==a[i]+a[j])
				{
					System.out.printf("%d%d",i,j);
					flag=1
				}
			}
			if(flag==1)
			{
				break;
			}	
		}
	}
}
