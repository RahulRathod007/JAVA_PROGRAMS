/* Full pyramid Number
		1
      2 3 2 
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
public class NumberFullPyramid
{
	public static void main(String x[])
	{	 
		for(int i=1;i<=5;i++)
		{	  int k=i;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.printf("%d",k);
					 if(j<5)
					 {
						 k++;
					 }
				
				   else
				   {
					   k--;
				   }
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.print("\n");
		}	
	}
}