//Multilevel Inehritance using Super class
class P
{
	P(int m)
	{
		System.out.println("I am P "+m);
	}
}
class D extends P
{
	D(int x)
	{
		super(100); // call p constructor.
		System.out.println("I am Parent class "+x);
	}
}
class C extends D
{ C()
  {
	super(200);	// call D contructor.
	{
	   System.out.println("I am child class ");
	}
  }
}
public class MultilevelSuperCons
{
	public static void main(String x[])
	{
		C c1 = new C();
	}
}