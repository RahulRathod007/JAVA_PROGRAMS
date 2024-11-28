//Arithmatic Exception 
import java.util.*;
public class ArithmaticExceptionApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter Two values");
		a = xyz.nextInt();
		b = xyz.nextInt();
		
		try
		{
			c = a/b;
			System.out.println("Division is "+c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Second value should not be zero");
			System.out.println("Error is "+ex);
		}
		System.out.println("logic 1");
		System.out.println("Logic 2");
	}
}