/*Example: WAP to FindMissingElement with two methods 
void setArray(int a[]): this method can accept array as parameter 
void showMissing(): this method can find the missing element of array.
*/
class MissingElement
{
	int a[];
	void setArray(int a[])
	{
		this.a=a;
	}
	void showMissing()
	{
		System.out.println("Display Original Array \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("\nDisplay Missing Element \n");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1; j<a[i+1];j++)
			{
				System.out.print(" "+j);
			}
		}
	}
}
public class MissingElementPojoApp
{
	public static void main(String x[])
	{
		MissingElement m1 = new MissingElement();
		int a[] = new int[]{1,5,8,10,15};
		m1.setArray(a);
		m1.showMissing();
	}
}
