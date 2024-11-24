// Write a program in C to to print next greater elements in a given unsorted array. //Elements for which no greater element exist, consider next greater element as -1. 
import java.util.*;
public class NextGreaterElement
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[]{5,3,10,9,6,13};
		System.out.println("\n Display Array values \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
			System.out.printf("\nNext Bigger Element of %d in arrray is :%d",a[i],a[j]);
				break;
				}
				
			}
			if(i==a.length-1)
				{
			System.out.printf("\nNext Bigger Element of %d in arrray is :%d",a[i],-1);
				}
		}
	}
}