/*
	1
   121
  12321
 1234321
123454321
*/
public class NumberPyramid2
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{	int no=0;
			for(int j=1;j<=9;j++)
			{	
				if(j>=6-i && j<=4+i)
				{
					if(j<=5)
					{
						no++;
						System.out.printf("%d",no);
					}
					else
					{
						no--;
						System.out.printf("%d",no);
					}
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