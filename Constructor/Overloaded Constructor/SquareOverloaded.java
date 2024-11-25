//Overloaded Constructor
class Square
{
	Square(int x)
	{
		System.out.println("Integer Square is "+(x*x)); 
	}
	Square(float x)
	{
		System.out.println("Float Square is "+(x*x));
	}
}
public class SquareOverloaded
{
	public static void main(String x[])
	{
		Square s1 =  new Square(5);
		Square s2 =  new Square(10.0f);
	}
}