public class PatternPractice
{
	public static void main(String x[])
	{	//int no;
		// for(int i=1;i<=5;i++)
		// {	no = i;
			// for(int j=1;j<=9;j++)
			// {
				// if(j>=6-i && j<=4+i)
				// {
					// System.out.printf("%d",no);
					// if(j<5)
					// {
						// no++;
					// }
					// else
						// no--;
				// }
				// else
				// {
					// System.out.print(" ");
				// }
			// }
			// System.out.println();
		// }
		
		/*
			1
			121
			12321
			1234321
			123454321
		*/ 
		
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(i<6 && j<=6-i || j>=6+i)
				{
					System.out.print("*");
				}
				else if(i>6 && j<=i-6 || j>=18-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}