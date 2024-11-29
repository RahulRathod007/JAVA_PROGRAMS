public class SFirstPattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)  // outer loop for row.
		{	char ch =65;        //declare character .
			for(int j=1;j<=9;j++) //inner loop for column.  
			{
				if(j<=i*2-1) //logics
				{	
			     	System.out.printf("%c",ch);
					if(j<i)
					{
						ch++;
					}
					else
					{
						ch--;
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}