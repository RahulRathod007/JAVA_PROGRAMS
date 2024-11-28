//char charAt(int index): this method can return character on specified index from string.

public class CharAtIndex
{
	public static void main(String x[])
	{
		String s = new String ("Good");
		int l = s.length();
		for(int i=0;s.length;i++)
		{
			char ch = s.charAt(i);
			System.out.printf("s[%d] ---> %c\n",i,ch);
		}
	}
}