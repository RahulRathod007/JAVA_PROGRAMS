// WAP to create the class name as ArrayFeqCount with a following methods
import java.util.*;
class ArrayFeqCount
{
	int a[];
	int count;
	void setIntArray(int a[])
	{
		this.a=a;
	}
	void CountFreq()
	{
		System.out.println("\n Display Array values \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
		Arrays.sort(a); //sort array.
		System.out.println("\n Display Sorted Array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
		//freq count logics.
		System.out.println("\n Freqency Count ");
		for(int i=0;i<a.length;i++)
		{	count=1;
			if(i<a.length-1 && a[i]==a[i+1])
			{
				while(a[i]==a[i+1])
				{
					count++;
					i++;
				}
			}
			System.out.printf("\n%d---> %d\n",a[i],count);
		}
	}
}
public class ArrayFeqCountApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("\n Enter Values In Array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		ArrayFeqCount a1 = new ArrayFeqCount();
		a1.setIntArray(a);
		a1.CountFreq();
	}
}