/* Half Pyramid Capital Small.
a
AB
abc
ABCD
abcde
*/
public class ABCDHalfPyramid
{
	public static void main(String x[])
	{
		char ch1 = 64;
		char ch2 = 96;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{	
				if(i>=j)
				{	
					if(i%2==0)
					{
						System.out.printf("%c",ch1+j);
					}
					if(i%2!=0)
					{
						System.out.printf("%c",ch2+j);
					}
				}
			}
			
			System.out.printf("\n");
		}
	}
}