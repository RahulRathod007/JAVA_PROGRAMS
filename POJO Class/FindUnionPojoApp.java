/*Example:  WAP to create class FindUnion with two methods 
void setArray(int a[],int b[]): this method can accept two array as parameter 
int [] getUnionArray(): this method can perform union operation on array and return resultant array
*/
import java.util.*;
class FindUnion
{
	int a[];
	int b[];
	void setArray(int a[] , int b[])
	{
		this.a=a;
		this.b=b;
	}
	void getUnionArray()
	{
		System.out.println("\n Display First Array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("\n Display Second Array \n");
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("%d\t",b[i]);
		}
		int length = a.length + b.length;
		int c[] = new int[length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k++] = a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[k++] = b[i];
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
		//union logics
		System.out.println("\n Union of Array \n");
		for(int i=0;i<c.length;i++)
		{
			if(i<c.length-1 && c[i] == c[i+1])
			{
				while(c[i] == c[i+1])
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
public class FindUnionPojoApp
{
	public static void main(String x[])
	{
		FindUnion f1 = new FindUnion();
		int a[] = new int[]{1,2,3,4,5};
		int b[] = new int[]{2,4,5,6,7};
		f1.setArray(a,b);
		f1.getUnionArray();
	}
}