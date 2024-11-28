//Throws clause Example.
class Div
{
	void calDiv(int x,int y)throws Exception
	{
		int z = x/y;
		System.out.println("Z = "+z);
	}
}
public class ThrowsClauseApp
{
	public static void main(String x[])
	{
		try
		{
			Div d =  new Div();
			d.calDiv(6,0);
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
	}
}