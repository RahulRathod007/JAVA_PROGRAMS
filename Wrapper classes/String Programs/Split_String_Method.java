//String [] split(String str): this function is used for split the string using some specified character and return its array
/*
output :
		Abc@gmail.com
		MNO@gmail.com
		PQR@gmail.com
		STV@gamil.com
 */
public class Split_String_Method
{
	public static void main(String x[])
	{
		String str =" Abc@gmail.com , MNO@gmail.com , PQR@gmail.com , STV@gamil.com";
		String emails [] = str.split(",");
		
		for(String email : emails)
		{
			System.out.println(email);
		}
	}
}