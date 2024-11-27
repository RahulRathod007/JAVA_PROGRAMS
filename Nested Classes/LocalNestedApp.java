//Local Nested class
class ABC 
{
	void display()
	{
		class MNO
		{
			void show()
			{
				System.out.println(" I am Show ");
			}
		}
		MNO m = new MNO();
		m.show();
	}
}
public class LocalNestedApp
{
	public static void main(String x[])
	{
		ABC a1 = new ABC();
		a1.display();
	}
}