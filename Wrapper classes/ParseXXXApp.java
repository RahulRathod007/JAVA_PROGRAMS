//Parse xxx() method : this method used for convert String type value to primitive.

public class ParseXXXApp
{
	public static void main(String x[])
	{
		
		String s ="1234"; 
		
		int i = Integer.parseInt(s);  // String to integer conversion.
		float f = Float.parseFloat(s); // string to float conversion.
		double d = Double.parseDouble(s); // string to double conversion.
		
		System.out.println(" Integer is "+i);
		System.out.println(" Float is "+f);
		System.out.println(" Double is "+d);
		
		//if String contain non-numeric value then we need to write following code.
		/*
		try
		{
			String s ="1234a";   //NumberFormatException.
			int i = Integer.parseInt(s);  // String to integer conversion.
			float f = Float.parseFloat(s); // string to float conversion.
			double d = Double.parseDouble(s); // string to double conversion.
			
			System.out.println(" Integer is "+i);
			System.out.println(" Float is "+f);
			System.out.println(" Double is "+d);
		}
		catch(Exception ex)
		{
		   System.out.println("Error is "+ex);	
		}
		*/
	}
}