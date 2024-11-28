//String(char[],int offset,int length): this constructor help us to access the particular size character array and convert in string.

public class Access_Particular_Array
{
	public static void main(String x[])
	{
		char ch[]= new char[]{'a','b','c','d','e','f','g','h'};
		String s1 = new String(ch,3,5);
		System.out.println(s1);
	}
}
