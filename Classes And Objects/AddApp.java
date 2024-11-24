// Addition of two numbers using class and objects.
import java.util.*;
class Add  // step 1 create class 
{
	int a,b;
	void setvalue(int x, int y) // step 2 write method or function
	{
		a = x;
		b = y;
	}
	void getAdd()
	{
		System.out.printf("\n Addition of Subject : %d\n",a+b);
	}
}
public class AddApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n Enter Two numbers \n");
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		Add ad = new Add(); //step-Create object
		ad.setvalue(a,b); // call by using object
		ad.getAdd();
	}
}