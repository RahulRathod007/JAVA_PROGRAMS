//Write a program to move all zeroes to the end of a given array. 
import java.util.*;
public class MoveZeroEndArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[]{5,3,0,9,0};
		System.out.println("\n Display Array values \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
					if(a[i]==0)
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("\n Shifting Zero at end \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}