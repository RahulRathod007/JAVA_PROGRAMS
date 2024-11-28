//Valueof() method : this method used for convert primitive type value into Reference type.

public class ValueofApp
{
	public static void main(String x[])
	{
		int a =100;
	
		Float f = Float.valueOf(a);     //convert int primitive to float reference
		String s = String.valueOf(a);  //convert int primitive to String reference
		Double d = Double.valueOf(a); //convert int primitive to Double reference
		Long l = Long.valueOf(a);	 //convert int primitive to Long reference
		
		System.out.println("Float is "+f);
		System.out.println("String is "+s);
		System.out.println("Double is "+d);
		System.out.println("Long is "+l);
		
	}
}