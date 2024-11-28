//NumberFormatException

public class NumberFormatExceptionApp
{
	public static void main(String x[])
	{
		try
		{
			String s = "1234 ";
			int a = Integer.parseInt(s);
			System.out.printf("A =%d\n",a);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Plase check string string data");
			System.out.println("Error is "+ex);
		}
		System.out.println("Logic 1");
		System.out.println("Logic 2");
		
	}
}