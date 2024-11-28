public class WrapperClassDemo
{
	public static void main(String x[])
	{
		
		String s1 = "ABC";
		String s2 = new String ("ABC");
		
		System.out.println(" HASHCODE of s1 "+System.identityHashCode(s1));
		System.out.println(" HASHCODE of s2 "+System.identityHashCode(s2));

	}
}