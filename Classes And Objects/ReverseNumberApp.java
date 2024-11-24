
/*WAP to create class name as Reverse with two functions 
void setvalue(): this function accept number as parameter from keyboard 
void getReverse(): this function can reverse the number.
*/
import java.util.*;
class Reverse
{
	int no,rem,rev=0;
	void setvalue(int x)
	{
		no = x;
	}
	void getReverse()
	{
		while(no!=0) 
		{
			rem =no % 10;
			no = no / 10;
			rev = rev*10+rem;
		}
		System.out.printf("Reverse is %d",rev);
	}	
}
public class ReverseNumberApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("\nEnter a Number : ");
		int no = xyz.nextInt();
		Reverse rev = new Reverse();
		rev.setvalue(no);
		rev.getReverse();
	}
}