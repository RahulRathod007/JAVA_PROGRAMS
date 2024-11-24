//wap to input 10 size array and seperate all positive and negative values into another //arrays  and display it.
import java.util.*;
public class PositiveNegativeArray
{
	public static void main(String x[])
	{
		int a[] = new int [5];
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n Enter array values \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("\n Display Array values ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("\n Positive Numbers are : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.printf("%d\t",a[i]);
			}
		}
		System.out.println("\n Negative Numbers are : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.printf("%d\t",a[i]);
			}
		}
	}
}