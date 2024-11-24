/* Inverted HalfPyramid pattern.
A 
ABA 
ABCBA 
ABCDCBA 
ABCDEDCBA
*/
public class ABAHalfPyramid
{
	public static void main(String x[])
	{
		char ch;
		for(int i=1;i<=5;i++)
		{     ch=64;
			for(int j=1;j<=9;j++)
			{   
				if(j>=1 && j<=9)
			{
				ch++;
			}
				if(i>=j)
				{
					System.out.printf("%c",ch);
				}
			}
			System.out.printf("\n");
		}
	}
}