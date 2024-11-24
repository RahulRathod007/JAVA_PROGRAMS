// Write a program rotate an array by N positions.
import java.util.*;
public class RotateArrayApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int [5];
		int b[] = new int [5];
		int position;
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
		System.out.println("\n enter a positon where you want to rotate array \n");
		position = xyz.nextInt();
		int k=0;
		for(int i=position;i<a.length;i++)
		{
			b[k]=a[i];
			k++;
		}
		for(int i=0;i<position;i++)
		{
			b[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("%d\t",b[i]);
		}
		
	}
}
