/*  Flag Number Pyramid.
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/
public class FlagNumberPattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{	char ch=49;
			int flag=0;
			for(int j=1;j<=9;j++)
			{	
				if(j>=6-i && j<=4+i)
				{
					if(flag==0)
					{
					System.out.printf("%c",ch);
					flag=1;
					ch++;
					}
					else
					{
						System.out.printf(" ");
						flag=0;
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