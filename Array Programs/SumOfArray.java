//WAP to create array of size 5 and calculate sum of all values.
import java.util.*;
public class SumOfArray
{
	public static void main(String x[])
	{
		int a[] = new int[5];
		int sum=0;
		Scanner xyz = new Scanner (System.in);
		System.out.println("Enter a values in Array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		//sum of array logics
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.printf("\n\nSum of Array is : %d ",sum);
	}
}