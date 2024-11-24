/*WAP to create class name as FindUnion with functions 
void setArray(int a[],int b[]): this function accept two array as parameter
void findUnion(): this function can find the union of two array and store in third array
*/
import java.util.*;
class FindUnion
{
	int arr1[],arr2[];
	void setArray(int a[] , int b[])
	{
		arr1 = a;
		arr2 = b;
	}
	void findUnion()
	{
		System.out.println("\n Display First Array \n");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.printf("%d\t",arr1[i]);
		}
		System.out.println("\n Display Second Array \n");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.printf("%d\t",arr2[i]);
		}
		int length = arr1.length + arr2.length;
		int c[] = new int[length];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			c[k++] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			c[k++] = arr2[i];
		}
		System.out.println("\n Display Merge Array \n");
		for(int i=0;i<c.length;i++)
		{
			System.out.printf("%d\t",c[i]);
		}
		System.out.println("\n After Sorting Array third \n");
		Arrays.sort(c);
		for(int i=0;i<c.length;i++)
		{
			System.out.printf("%d\t",c[i]);
		}
		System.out.println("\n Union of Array \n");
		for(int i=0;i<c.length;i++)
		{
			if(i<c.length-1 && c[i] == c[i+1])
			{
				while(i<c.length-1 && c[i] == c[i+1])
				{
					i++;
				}
				System.out.printf("%d\t",c[i]);	
			}
			else
			{
				System.out.printf("%d\t",c[i]);
			}
		}
	}
}
public class FindUnionApp
{
	public static void main(String x[])
	{
		int a[] = new int[]{1,2,4,5,6,7};
		int b[] = new int[]{4,5,6,3,8,7};
		FindUnion F = new FindUnion();
		F.setArray(a,b);
		F.findUnion();
	}
}