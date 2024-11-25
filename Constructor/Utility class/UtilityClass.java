//Utility class 
class T
{
	private T()
	{	
	}
	static void show()
	{
		System.out.println("I am Show Method");
	}
	static void display()
	{
		System.out.println("I am Display method");
	}
}
public class UtilityClass
{
	public static void main(String x[])
	{
		T.show();
		T.display();
	}
}