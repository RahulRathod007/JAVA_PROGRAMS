/* Half pyramid Number pattern
	1
	22
	333
	4444
	55555
*/
public class NumberHalfPyramid
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.printf("%c",48+i);
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}