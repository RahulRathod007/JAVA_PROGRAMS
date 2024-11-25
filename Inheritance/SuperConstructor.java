//Super Constructor
class P
{
	P(int x)
	{
		System.out.println("I am Parent Constructor "+x);
	}
}
class R extends P
{
	R()
	{ super(100);  // super must be first line of code. by using super we can class Parent class Constructor
	  System.out.println("I am Child class Constructor");
	}
}
public class SuperConstructor
{
	public static void main(String x[])
	{
		R r = new R();
	}
}