/*
JAGGED ARRAY PROGRAM.
Syntax:
datatype variablename[][] = new datatype[row][];
a[rowindex]=new datatype[colsize];
*/
import java.util.*;
public class JagArrayApp
{
	public static void main(String x[])
	{
		int a[][] = new int [3][];
		a[0] = new int [2];
		a[1] = new int [3];
		a[2] = new int [4];
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Array values \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("Display Jagged Array \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		}
	}
}