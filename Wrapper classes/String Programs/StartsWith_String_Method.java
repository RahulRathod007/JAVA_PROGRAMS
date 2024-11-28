//boolean startsWith(String): this method check string start with particular data or not if start with particular data return true otherwise return false.

public class StartsWith_String_Method
{
	public static void main(String x[])
	{
		String s = "Rahul";
		boolean b = s.startsWith("R");
		
		if(b)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}