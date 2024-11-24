/*WAP to create the class name as PrintMatrix with a two methods void acceptTwoDArray(int x[][]) and    showMatrix() sample code given below */
import java.util.*;
class PrintMatrix
{
	int a[][];
	void acceptTwoDArray(int a[][])
	{
		this.a=a;
	}
	void showMatrix()
	{
		System.out.println("\n Display Two Diametional Matrix \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.print("\n");
		}
	}
}
public class PrintMatrixApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("\n Enter values in Two D Matrix \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		
		PrintMatrix p = new PrintMatrix();
		p.acceptTwoDArray(a);
		p.showMatrix();
	}
}