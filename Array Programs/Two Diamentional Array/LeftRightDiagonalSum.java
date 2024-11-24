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
		
	}
}

