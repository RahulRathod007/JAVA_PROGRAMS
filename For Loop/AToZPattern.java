/* A TO Z  5 x 5 pattern.
	ABCDE
	FGHIJ
	KLMNO
	PQRST
	UVWXY
*/
public class AToZPattern
{
	public static void main(String x[])
	{	
		int ch=65;
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%c",ch);
				ch++;
			}
			System.out.printf("\n");
		}
	}
}