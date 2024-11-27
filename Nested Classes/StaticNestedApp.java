//Static Nested class.
// Syntax : outerclassname.innerclassname  ref = new outerclassname.innerclassname(); 
class ABC
{
	static class MNO
	{
		void show()
		{
			System.out.println(" I am Static Nested class ");
		}
	}
}
public class StaticNestedApp	
{
	public static void main(String x[])
	{
		ABC.MNO m = new ABC.MNO();
		m.show();
	}
}