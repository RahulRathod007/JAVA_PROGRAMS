//This Constructor
class T
{
	T()
	{
		this(5);
		System.out.println("\n I am Default Constructor");
	}
	T(int x)
	{
		this(5.5f);
		System.out.printf("\n I am Integer parameterize Constructor %d",x);
	}
	T(float x)
	{
		System.out.printf("\n I am Float parameterize Constructor %f",x);
	}
}
public class ThisConstructor
{
	public static void main(String x[])
	{
		T t1 = new T();
	}
}