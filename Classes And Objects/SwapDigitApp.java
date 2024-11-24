/*WAP to create class name as SwapDigit with two functions
void setValue(int no): this function can accept number as parameter 
int getNumAfterSwap(): this function can swap first and last digit of number and return it.
*/
import java.util.*;
import java.lang.Math;
class SwapDigit 
{ 
	int no,count=0;
	void setvalue(int x)
	{
		no = x;
	}
	void getNumAfterSwap()
	{ 
		
		int temp=no;
		int count=0;
		while(no!=0)
		{
			no = no /10;
			count++;
		}

		int last= no%10;
		int p =(int)Math.pow(10,--count);
		int first = temp/p;
		temp = temp % p;
		int mid = temp/10;
		int sum = last*p+mid*10+first;
		System.out.printf("Reverse is %d",sum);
		
		/*no=temp;
		int last= no%10;
		int pow=(int)(Math.pow(10,--count));
		int first= no%pow;
		no = (no/pow)-last;
		no=(last*pow)+no+first;
		System.out.printf("Reverse is %d",no);
		*/
	}
}
public class SwapDigitApp	
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n Enter a number \n");
		int no = xyz.nextInt();
		SwapDigit s1 = new SwapDigit();
		s1.setvalue(no);
		s1.getNumAfterSwap();
	}
}