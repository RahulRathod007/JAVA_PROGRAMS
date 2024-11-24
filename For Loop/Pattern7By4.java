public class Pattern7By4
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{	
			for(int j=1;j<=4;j++)
			{	int no=2+i;
				if(i>=j && i<=8-j)
				{
					if(i<=4)
					{
						System.out.printf("%d",no);
					}
					else
					{
						no=10-i;
						System.out.printf("%d",no);
					}
				}
			}
			System.out.print("\n");
		}
	}
}