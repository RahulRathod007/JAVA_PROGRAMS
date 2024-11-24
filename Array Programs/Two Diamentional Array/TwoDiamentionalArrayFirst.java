//wap to input 3x3 array matrix and display it.
import java.util.*;
public class TwoDiamentionalArrayFirst
{
	public static void main(String x[])
	{
		int a[][] = new int[3][3];
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a values in Array \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("\nTwo Diamentional Array \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println("\n");
		}
	}
}
