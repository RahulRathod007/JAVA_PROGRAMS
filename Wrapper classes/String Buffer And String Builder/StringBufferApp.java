//String Buffer And String Builder Methods.
// Append,Insert,delete.
public class StringBufferApp
{
	public static void main(String x[])
	{
		StringBuffer sb = new StringBuffer ("Good Morning");
		System.out.println("Before Append  "+sb);
		
		sb.append(" India ");
		System.out.println("After Append  "+sb);
		
		System.out.println("Before Insert  "+sb);
		sb.insert(0," Very ");
		System.out.println("After Insert  "+sb);
		
		System.out.println("Before Delete  "+sb);
		sb.delete(6,10);
		System.out.println("After Delete  "+sb);
		
	}
}