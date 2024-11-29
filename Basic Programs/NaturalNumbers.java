//printf all natural numbers 1 to n.
import java.util.*;
public class NaturalNumbers
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,i=1;
		System.out.println("\n Enter a number \n");
		no = xyz.nextInt();
		while(i<=no)
		{
			System.out.printf("%d\t",i);
			i++;
		}
	}
}