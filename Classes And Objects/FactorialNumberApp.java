/*WAP to create class name as Factorial  with two functions 
void setValue(int no): this function can accept number as parameter
void calFactorial(): this function can calculate  factorial of number and display it.
*/
import java.util.*;
class Factorial
{
	int no,fact=1;
	void SetValue(int x)
	{
		no = x;
	}
	void CalFactorial()
	{
		for(int i=1;i<=no;i++)
		{
			fact = fact * i;
		}
		System.out.printf("Factorial is %d",fact);
	}
}
public class FactorialNumberApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n Enter a number : ");
		int no = xyz.nextInt();
		Factorial f = new Factorial();
		f.SetValue(5);
		f.CalFactorial();
	}
}