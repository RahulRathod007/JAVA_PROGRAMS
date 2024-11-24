//Array Fixed values program.
//Syntax 1: int a[] = {10,20,30,40,50};
//syntax 2: int a[] = new int[]{10,20,30,40,50};

import java.util.*;
public class ArrayFixValues
{
	public static void main(String x[])
	{
		int a[] = new int[]{10,20,30,40,50};
		System.out.println("Display Array values \n");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}