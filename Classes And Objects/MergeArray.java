/*WAP to create class name as MergeArray with two functions 
void acceptArray(int a[],int b[]): this function accept two array as parameter and merge them and store in third array
void showArray(): this function can show the merged array
*/
class Merge
{
	int arr1[],arr2[],arr3[];
	void SetArray(int a[] ,int b[])
	{
		arr1 = a;
		arr2 = b;
	}
	void ShowArray()
	{	
		System.out.println("\n First Array \n");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.printf("%d\t",arr1[i]);
		}
		System.out.println("\n Second Array \n");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.printf("%d\t",arr2[i]);
		}
		int length = arr1.length + arr2.length;
		int c[] = new int[length];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			c[k] = arr1[i];
			k++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			c[k] = arr2[i];
			k++;
		}
		System.out.println("\n Merge Array is \n");
		for(int i=0;i<c.length;i++)
		{
			System.out.printf("%d\t",c[i]);
		}
		
	}
}
public class MergeArray
{
	public static void main(String x[])
	{
		int a[] = new int[]{1,2,3,4,5};
		int b[] = new int[]{6,7,8,9,10};
		Merge m = new Merge();
		m.SetArray(a,b);
		m.ShowArray();
	}
}
