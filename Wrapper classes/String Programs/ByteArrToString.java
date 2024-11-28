//String(byte[]): this constructor is used for accept the byte array or take ascii as input and convert in string object.

public class ByteArrToString
{
	public static void main(String x[])
	{
		byte b [] = new byte[] {97,98,99,100};
		String s = new String(b);
		System.out.println(s);
	}
}