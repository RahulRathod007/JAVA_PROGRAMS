//InputMismatchException 
import java.util.*;
public class InputMismatchExceptionApp
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
			c = a + b;
			System.out.println(" C = "+c);
		}
		catch(Exception ex)
		{
			// System.out.println("You cannot give input as integer datatype to float");
			System.out.println("Error is "+ex);
		}
	}
}