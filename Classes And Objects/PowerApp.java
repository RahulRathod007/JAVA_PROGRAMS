/*WAP to create class name as Power with two functions 
void setValue(int base,int index): this method can accept base and index value
void calPower(): this method can calculate power of number and display it.
*/
import java.util.*;
class Power
{
	int base,index,p=1;
	void setvalue(int x , int y)
	{
		base = x;
		index = y;
	}
	void calpower()
	{ 
		for(int i=1;i<=index;i++)
		{
			p = p * base;
		}
		System.out.printf("\n Power is %d",p);
	}
}
public class PowerApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n Enter a base and index \n");
		int base = xyz.nextInt();
		int index = xyz.nextInt();
		Power p1 = new Power();
		p1.setvalue(base,index);
		p1.calpower();
	}
}