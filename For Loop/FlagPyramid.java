/* flag 5 x 11 Full Pyramid 
             *
		   *   *
		*    *    *
	 *    *     *    *
   *   *     *     *    *
*    *    *     *    *     *

*/
public class FlagPyramid
{
	public static void main(String x[])
	{   
		for(int i=1;i<=6;i++)
		{	int flag=0;
			for(int j=1;j<=11;j++)
			{	
				if(j>=7-i && j<=5+i)
				{
					if(flag==0)
					{
						System.out.print("*");
						flag=1;
					}
					else
					{
						System.out.print(" ");
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