/* WAP to create 3 x 3 matrices and calculate the sum of row 
1     2    3    = 6
4     5    6    = 15
7     8    9    = 24
*/
import java.util.*;
public class TwoDArrayRowSum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[][]= new int [3][3];
		System.out.println("\n Enter a 3 x 3 matrix values \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("\n Display Two Diamentional Array \n");
		//sum logics 
		for(int i=0;i<a.length;i++)
		{	int sum =0;
			for(int j=0;j<a[i].length;j++)
			{	
				System.out.printf("%d\t",a[i][j]);
				sum = sum + a[i][j];
			}
			System.out.printf(" = %d\n",sum);
		}
	}
}