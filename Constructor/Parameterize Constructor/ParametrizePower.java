/*WAP to create class name as Power with parameterized constructor and one method 
Power(int base,int index): accept the two value first as base and second as index.
int getPower(): this is used for calculate the power of number and return it. */
import java.util.*;
class Power
{
	int base ,index ,p=1;
	Power(int base, int index)
	{
		this.base = base;
		this.index = index;
	}
	int getPower()
	{
		for(int i=1;i<=index;i++)
		{
			p = p * base;
		}
		return p;
	}
}
public class ParametrizePower
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n Enter Base And Index \n");
		int base = xyz.nextInt();
		int index = xyz.nextInt();
		Power p1 = new Power(base,index);
		int result = p1.getPower();
		System.out.printf("Power is %d",result);
	}
}
