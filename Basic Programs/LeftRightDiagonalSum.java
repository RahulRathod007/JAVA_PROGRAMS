//WAP to create 3x3 matrixes and calculate the sum of left & right diagonal of element.
import java.util.*;
public class LeftRightDiagonalSum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[][]= new int [3][3];
		System.out.println("\n Enter a 3 x 3 Matrix values \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("\n Display Two Diamentional Array \n");
		int lsum=0;
		int rsum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
				if(i==j)
				{
				lsum = lsum +a[i][j];
				}
				if(j==2-i)
				{
					rsum = rsum +a[i][j];
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\nsum of left diagonal is %d",lsum);
		System.out.printf("\nsum of right diagonal is %d",rsum);
	}
}

