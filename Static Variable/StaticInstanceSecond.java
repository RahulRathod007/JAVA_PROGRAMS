//Static variable and instance variable
class ABC
{
	static int a;
	int b;
}
public class StaticInstanceSecond
{
	public static void main(String x[])
	{
		ABC  a1 = new ABC();
		ABC  a2 = new ABC();
		a1.a=100;
		a1.b=200;
		System.out.println("\n Using First Object ");
		System.out.printf(" A = %d \n B = %d",a1.a,a1.b);
		System.out.println("\n\n Using Second Object \n");
		System.out.printf(" A = %d \n B= %d",a2.a,a2.b);
	}
}