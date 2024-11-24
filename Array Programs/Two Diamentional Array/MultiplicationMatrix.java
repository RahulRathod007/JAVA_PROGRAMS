/*Wap to print Multiplication of Two Matrix.
                                          
	1     2    3	*  1     2    3    =    30    36    42
	4     5    6	*  4     5    6	   =	66    81    96
    7     8    9    *  7     8    9    =    102   126   150
*/	 
import java.util.*;
public class MultiplicationMatrix
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int sum;
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];
		System.out.println("\n Enter First 3 x 3 Matrix \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("\n Enter Second 3 x 3 Matrix \n");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j] = xyz.nextInt();
			}
		}
		System.out.println("\n Display First Matrix \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.println("\n Display Second Matrix \n");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.printf("%d\t",b[i][j]);
			}
			System.out.printf("\n");
		}
		//multiplication of two matrix 
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a.length;j++)
			{	sum=0;
				for(int k=0;k<a.length;k++)
				{
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		System.out.println("\n Multiplication of Two Matrix is \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
