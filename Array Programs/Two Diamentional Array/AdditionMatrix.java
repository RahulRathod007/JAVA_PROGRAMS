//Wap to print Addition of two matrix.
import java.util.*;
public class AdditionMatrix
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner (System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		System.out.println("\n Enter a values in First Matrix \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("\n Enter a values in Second Matrix \n");
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
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{	sum =0;
			for(int j=0;j<a[i].length;j++)
			{
				sum = a[i][j] + b[i][j];
				c[i][j] = sum;
			}
		}
		System.out.println("\n Addition Matrix is : \n");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
