//int indexOf(String): this function is used for return index of string and if data not found in string return -1 
//Note: indexOf() method normally recommend if we want to search data from string.

public class IndexOf_String_Method
{
	public static void main(String x[])
	{
		String s = "Good Morning India";
		int index = s.indexOf("Morning");
		if(index != -1)
		{
			System.out.println("Data Found "+index);
		}
		else
		{
			System.out.println("Data Not Found "+index);
		}
	}
}