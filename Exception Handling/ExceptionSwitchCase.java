//Wap in java to handle all given exception using switch case?
import java.util.*;
public class ExceptionSwitchCase
{	static int a[];
	public static void main(String x[])
	{
		System.out.println("1. ArrayIndexOutOfBoundsException");
		System.out.println("2. ArithmeticException");
		System.out.println("3. StringIndexOutOfBoundsException");
		System.out.println("4. NullPointerException");
		System.out.println("5. NumberFormatException");
		System.out.println("6. InputMismatchException");
		System.out.println("7. ClassNotFoundException");
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Choice");
		int choice = xyz.nextInt();

		switch(choice)
		{
			case 1: 
			{	//ArrayIndexOutOfBoundsException
				try
				{
					int a[] = new int[2];
					a[0] = 10;
					a[1] = 20;
					a[2] = 200;
					System.out.println(a[2]);
				}
				catch(ArrayIndexOutOfBoundsException ex)
				{
					System.out.println("index value greater than array size");
					System.out.println("Error is "+ex);
				}
					System.out.println("Logic 1");
					System.out.println("Logic 2");
				break;
			}
			case 2:
			{	//ArithmeticException
				System.out.println("Enter Two values");
				int a = xyz.nextInt();
				int b = xyz.nextInt();
				try
				{
					int c = a/b;
					System.out.println("Division is "+c);
				}
				catch(ArithmeticException ArEx)
				{
					System.out.println("Second value should not be zero");
					System.out.println("Error is "+ArEx);
				}
				System.out.println("Logic 2");
				System.out.println("Logic 1");
				break;
			}
			case 3:
			{	//StringIndexOutOfBoundsException
				
				break;
			}
			case 4:
			{	//NullPointerException
				try
				{
					a[0] = 10;
					System.out.println(a[0]);
				}
				catch(NullPointerException ex)
				{
					System.out.println("You are using Reference without Memory allocation or without using new Keyword");
					System.out.println("Error is "+ex);
				}
			    System.out.println("Logic 2");
				System.out.println("Logic 1");
				break;
			}
			case 5:
			{	//NumberFormatException.
				try
				{
					String s ="1234 ";
					int a = Integer.parseInt(s);
					System.out.println("A = "+a);
				}
				catch(NumberFormatException ex)
				{
					System.out.println("Please check String data");
					System.out.println("Error is "+ex);
				}
				System.out.println("Logic 1");
				System.out.println("Logic 2");
				break;
			}
			case 6:
			{	//InputMismatchException
				int a,b,c;
				System.out.println("Enter two values");
				a = xyz.nextInt();
				b = xyz.nextInt();
				try
				{
					c = a + b;
					System.out.println(" C = "+c);
				}
				catch(Exception ex)
				{
					System.out.println("Error is "+ex);
				}
				break;
			}
			case 7:
			{
				break;
			}
			default:
			{
				System.out.println("Invalid choice");
			}
			
		}



	}
}
		