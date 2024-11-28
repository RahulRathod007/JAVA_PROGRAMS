//NullPointerException
public class NullPointerExceptionApp
{	static int a[];
	public static void main(String x[])
	{
		try
		{
			a[0] = 100;
			System.out.println(a[0]);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Error is "+ex);
		}
		System.out.println("Logic 1");
		System.out.println("Logic 2");
	}
}	