//Auto Boxing and Auto Unboxing Example.

public class BoxingApp
{
	public static void main(String x[])
	{
		int a =100;
		Integer b = a; //Auto Boxing.
		System.out.printf("B = %d \n",b);
		
		Integer c = 200;
		int d = c; // Auto Unboxing.
		System.out.printf("D = %d",d);
		
	}
}	