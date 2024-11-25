class sum 
{
	int sum=0;
	void calSum(int ...x)
	{
		for(int i=0;i<x.length;i++)
		{
			sum = sum + x[i];
		}
		System.out.printf("Sum is %d",sum);
	}
}
public class SumAppJava
{
	public static void main(String x[])
	{
		sum s = new sum();
		s.calSum(10,20,30,40,50);
	}
}