//wap input 10 size of array & display seperate all prime numbers in array & display it
import java.util.*;
public class PrimeArray
{
	public static void main(String x[])
	{
		int a[] = new int[10];
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n enter a values in array \n");
		for(int i=0; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("\n Display Array values \n");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("\n Prime numbers in array \n");
		for(int i=0; i<a.length; i++)
		{
			int j=1;
			int count=0;
			while(j<=a[i])
			{
				if(a[i]%j==0)
				{
					count++;
				}
				j++;
			}
			if(count==2)
			{
				System.out.printf("%d\t",a[i]);
			}
		}
	}
}
