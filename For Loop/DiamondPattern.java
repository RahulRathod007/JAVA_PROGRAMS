
public class DiamondPattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=13;i++)
		{
			for(int j=1;j<=13;j++)
			{
				if(j>=8-i && j<=6+i && i<8)
				{
					System.out.print("*");
				}
				else if(j>=i-6 && j<21-i && i>7)
				{
					System.out.print("*");
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