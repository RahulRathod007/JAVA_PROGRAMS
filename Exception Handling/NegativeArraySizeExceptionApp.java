//NegativeArraySizeException
public class NegativeArraySizeExceptionApp
{
	public static void main(String x[])
	{
		try
		{
			int a[] = new int[-2];
			System.out.println(a);
		}
		catch(NegativeArraySizeException ex)
		{
			System.out.println("You cant give Array size as negative");
			System.out.println("Error is "+ex);
		}
		System.out.println("logic 1");
		System.out.println("logic 2");
	}
}