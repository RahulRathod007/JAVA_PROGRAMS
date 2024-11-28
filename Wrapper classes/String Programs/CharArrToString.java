//String(char[]): this constructor help us to accept character array as input and convert in string object.

public class CharArrToString
{
	public static void main(String x[])
	{
		char ch [] = new char[]{'a','b','c'};
		String s1 = new String(ch);  // char array to String coversion.
		System.out.println(s1);
	}
} 
