//WAP to create array and find second highest value with sorting.
import java.util.*;
public class SecondLargestArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter a values in array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array values \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("\n Ascending Array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[a.length-1]==a[i])
			{
				++count;
			}
		}
	System.out.print("\nSecond highest value of array is "+a[a.length-(count+1)]);
	}
}

/*
//WAP to create array and find second highest value without sorting.
import java.util.*;
public class FindingMaxApp
{
  public static void main(String []x)
  {
      Scanner xyz  = new Scanner(System.in);
	    int a[]=new int[5];
	System.out.println("Enter values in array");
	  for(int i=0;i<a.length;i++)
	  {
	    a[i]=xyz.nextInt();
	  }
	  int m=a[0];
	  for(int i=1; i<a.length; i++)
	  {
	     if(a[i]>m)
		 { m=a[i];
		 }
	  }
	  System.out.printf("Max value is %d\n",m);
  }
}
*/
