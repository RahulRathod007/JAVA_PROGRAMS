//Write a java program check whether number is positive , negative or zero.
import java.util.*;
public class CheckNumberApp
{
	public static void main(String x[])
	{
		int no;
		System.out.println("\n enter a number \n");
		Scanner xyz = new Scanner(System.in);
		no = xyz.nextInt();
		String s = (no>=1 && no<=9) ? "Positive number":(no<0) ? "Negative" :"Zero";
		System.out.println(s);
	}
}