//int length(): this method help us return length of string or size of string.

public class StringLength
{
	public static void main(String x[])
	{	
		//Using length() Function.
		// String s = new String ("Good");
		// int l = s.length();
		// System.out.println(l);
		
		//Without using length() function.
		String s = new String ("Good");
		int count=0;
		try{
			do{
				s.charAt(count);
				count++;
			}while(true);
			
		}
		catch(Exception ex)
		{
			System.out.println("Length of Strin is "+count);
		}
	}
}