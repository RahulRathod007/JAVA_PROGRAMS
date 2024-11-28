//implicit and explicit conversion.

public class Implicit_Explicit_Conversion
{
	public static void main (String x[])
	{
		long a ;
		int b =100;
		a = b; //implicit conversion.
		System.out.printf(" A = %d \n",a);
		long r = 10;
		int s;
		s = (int)r;	 // explicit conversion.
		System.out.printf(" S = %d",s );
	}
}	