/*  Inverted Full pyramid
* * * * * * * * *
  * * * * * * *
    * * * * *
	  * * *
	    *
*/
public class FullPyramidInverted
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i<=j && j<=10-i)
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