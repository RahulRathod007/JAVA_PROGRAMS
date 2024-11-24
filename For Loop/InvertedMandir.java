/*
A        A
AB      BA
ABC    CBA
ABCD  DCBA
ABCDEEDCBA
*/
public class InvertedMandir
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{	char ch = 65;
			for(int j=1;j<=10;j++)
			{
				if(j<=i || j>=11-i)
				{
					if(j<=5)
					{
						System.out.printf("%c",ch++);
					}
					else
					{
						System.out.printf("%c",--ch);
					}
					
				}
				else
				{
					System.out.printf(" ");
					// ch--;
				}
			}
			System.out.println(" ");
		}
	}
}
