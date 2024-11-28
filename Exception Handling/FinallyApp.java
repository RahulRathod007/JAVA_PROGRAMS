//Try Catch And Finally 
import java.util.*;
public class FinallyApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		try
		{
		int a,b,c;
		System.out.println("Enter Two values");
		a = xyz.nextInt();
		b = xyz.nextInt();
		c = a / b;
		System.out.println("\nDivision is \nC = "+c);
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
		finally
		{
			System.out.println("I am Execute Always");
		}
		
	}
}