//WAP to input number and reverse it.
import java.util.*;
public class ReverseApp
{
	public static void main(String x[])
	{
		int no,rem,rev=0;
		Scanner xyz = new Scanner(System.in);
		System.out.println("enter a number \n");
		no = xyz.nextInt();
		while(no!=0)
		{
		rem = no % 10;
		no =  no / 10;
		rev = rev*10+rem;
		}
		System.out.printf("Reverse is %d",rev);
	}
}
