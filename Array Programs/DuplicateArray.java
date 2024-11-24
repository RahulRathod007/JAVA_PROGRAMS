//wap to find Duplicate element from array.
import java.util.*;
public class DuplicateArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[10];
		System.out.printf("\n Enter a Element in Array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.printf("\n Display Original Array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		//asccending logics
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
		System.out.printf("\n Display Asccending Array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.printf("\n Duplicate Element \n");
		for(int i=0;i<a.length-1;i++)
		{
			if(i<a.length-1 && a[i] == a[i+1])
			{
				System.out.printf("%d\t",a[i]);
				while(i<a.length-1 && a[i] == a[i+1])
				{
					i++;
				}
			}
		}
	}
}