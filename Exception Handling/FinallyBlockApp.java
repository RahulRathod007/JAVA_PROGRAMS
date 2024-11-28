//Finally Block
import java.util.*;
public class FinallyBlockApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two values");
		a = xyz.nextInt();
		b = xyz.nextInt();
		
		try
		{
			c = a / b;
			System.out.println("C = "+c);
		}
		finally 
		{
			System.out.println("I am Execute Always");
		}
	}
}