class VariableArgument
{
	int sum =0;
	void calSum(String name , int ...x)
	{
		System.out.printf("\n Name is %s",name);
		for(int i=0;i<x.length;i++)
		{
			sum = sum + x[i];
		}
		System.out.printf("\n Sum is %d",sum);
	}
}
public class VariableArgumentProgram
{
	public static void main(String x[])
	{
		VariableArgument v1 = new VariableArgument();
		v1.calSum("Rahul",10,20,30,40,50);
	}
}