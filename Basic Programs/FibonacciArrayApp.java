//WAP to create array of size and print Fibonacci series using array.
import java.util.*;
public class FibonacciArrayApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner (System.in);
		int len;
		System.out.println("\n Enter size of array \n");
		len = xyz.nextInt();
		int a[] = new int[len];
		a[0] = 0;
		a[1] = 1;
		for(int i=2;i<a.length;i++)
		{
				a[i] = a[i-1] + a[i-2];
		}
		System.out.println("\n Display Fibonacci Series \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}