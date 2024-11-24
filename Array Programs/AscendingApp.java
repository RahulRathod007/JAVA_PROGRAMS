//WAP to create array of size 5 and arrange all in ascending and descending order?
import java.util.*;
public class AscendingApp
{
	public static void main(String x[])
	{
		int a[] = new int[5];
		Scanner xyz = new Scanner(System.in);
		System.out.println(" Enter a values in Array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("\n\nAscending Array \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
			System.out.printf("%d\t",a[i]);
		}
	}
}