//Static variable and instance variable
class ABC
{
	static int a = 100;
	int b = 200;
}
public class StaticInstanceVar
{
	public static void main(String x[])
	{
		System.out.println(" A is "+ABC.a);
		ABC a1 = new ABC ();
		System.out.println(" B is "+a1.b);
		System.out.println(" A is using Object "+a1.a);
	}
}