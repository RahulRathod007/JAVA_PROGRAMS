/* Half Pyramid.
1
1 2
1 2 3 
1 2 3 4 
1 2 3 4 5
*/
public class HalfPyramid12345
{
	public static void main(String x[])
	{	char ch=48;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.printf("%c",48+j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}