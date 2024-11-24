/* Inverted Half Pyramid
1 2 3 4 5
1 2 3 4 
1 2 3
1 2
1
*/
public class InvertedHalfPyramid12345
{
	public static void main(String x[])
	{	char ch=48;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=6-i)
				{
					System.out.printf("%c",48+j);
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.print("\n");
		}
	}
}