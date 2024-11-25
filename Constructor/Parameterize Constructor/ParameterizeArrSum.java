/* WAP to create class name as Sum with one constructor and method 
Sum(int a[]): accept integer array as parameter 
int getSum(): this function can calculate sum of all array values and return it.*/
import java.util.*;
class Sum
{
	int a[],s=0;
	Sum(int a[])
	{
		this.a=a;
	}
	int getSum()
	{	
		for(int i=0;i<a.length;i++)
		{
			s = s+ a[i];
		}
		return s;
	}
}
public class ParameterizeArrSum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("\n Enter Array values \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		Sum s1 = new Sum(a);
		int result = s1.getSum();
		System.out.printf("Sum is %d",result);
	}
}