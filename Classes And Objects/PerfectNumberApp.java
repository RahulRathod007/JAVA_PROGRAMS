/*WAP to create class name as Perfect with two functions 
void setNum(int no): this function accept number as parameter 
void calPer(): this method can check number is perfect or not 
*/
import java.util.*;
class Perfect
{
	int no,sum=0,i=1;
	void setdata(int x)
	{
		no = x;
	}
	void calper()
	{
		while(i<no)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==no)
		{
			System.out.print("\n Perfect Number");
		}
		else 
		{
			System.out.print("\n not perfect Number");
		}
	}
}
public class PerfectNumberApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.printf("\n Enter a number : ");
		int no = xyz.nextInt();
		Perfect p = new Perfect();
		p.setdata(no);
		p.calper();
	}
}