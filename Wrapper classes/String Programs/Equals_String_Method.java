//boolean equals(Object): using this method can compare two strings with each 

public class Equals_String_Method
{
	public static void main(String x[])
	{
		String s = "abc";
		String s1 = "abc";
		boolean b = s.equals(s1);
		
		if(b)
		{
			System.out.println("Strings are Equal ");
		}
		else
		{
			System.out.println("Strings are Not Equal ");
		}
	}
}