//.WAP program create the class name as Sum with a following methods 

class Sum
{
	int sum = 0;
	void calsum(int ...x)
	{
		for(int i=0;i<x.length;i++)
		{
			sum = sum + x[i];
		}
		System.out.print("\n Sum is "+sum);
	}
}
public class SumApplication
{
	public static void main(String x[])
	{
		Sum s1 = new Sum();
		s1.calsum(10,20,30,40,50);
	}
}