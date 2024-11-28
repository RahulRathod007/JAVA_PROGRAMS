//int compareToIgnoreCase(String): this method is used for compare two strings with each other without considering letter cases and if string equal return 0 otherwise return first mismatch ascii code difference.

public class CompareTO_Ignorecase_String
{
	public static void main(String x[])
	{
		String s = "ABC";
		String s1 = "abc";
		int result = s.compareToIgnoreCase(s1);
		
		if(result==0)
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings Are Not Equal");
		}
	}
}