//int compareTo(String):  this method is used for compare two strings with each other by using lexical order means perform comparison between two string using character by character and if all characters of string equal then return 0 otherwise return ascii code difference of first mismatch character and return it.

public class CompareTo_String_Method
{
	public static void main(String x[])
	{
		String s = "abc";
		String s1 = "abc";
		int result = s.compareTo(s1);
		
		if(result ==0)
		{
			System.out.println("String are Equal "+result);
		}
		else
		{
			System.out.println("String are not Equal "+result);
		}
	}
}