//boolean endsWith(String): this method is used for check the string ends with particular data or not if string ends with particular data then return true otherwise return false.

public class EndsWith_String_Method
{
	public static void main(String x[])
	{
		String s = "Rahul";
		boolean b = s.endsWith("ul");
		
		if(b)
		{
			System.out.println("String Ends with ul ");
		}
		else
		{
			System.out.println("String Not Ends with ul ");
		}
	}
}