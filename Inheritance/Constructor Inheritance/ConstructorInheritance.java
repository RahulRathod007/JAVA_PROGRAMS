//Constructor in inheritance
class P
{
	P()
	{
		System.out.println("I am Parent Class Constructor");
	}
}
class R extends P
{
	R()
	{
		System.out.println("I am Child Class Constructor");
	}
}
public class ConstructorInheritance
{
	public static void main(String x[])
	{
		R r1 = new R();
	}
}