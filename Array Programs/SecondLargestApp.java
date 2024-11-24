// without sorting second largest array element. 
import java.util.*;
public class SecondLargestApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner (System.in);
		int a[] = new int [5];
		System.out.println("\n enter array values \n");
		for (int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array values \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
				if(a[i]>max)
				{
					max= a[i];
				}
		}
		System.out.printf("\n max element is %d",max);
		//logic without sorting
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==max)
			{
				a[i]=0;
			}
		}
		
		int max2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println("\n second max element is %d",max2);
	}
}
