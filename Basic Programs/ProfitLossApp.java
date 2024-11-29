//wap program in java to input cost price and selling price of a product and check profit or loss.
import java.util.*;
public class ProfitLossApp
{
	public static void main(String x[])
	{
		int cp,sp;
		System.out.print("\n enter a cost price \n");
		Scanner xyz = new Scanner(System.in);
		cp = xyz.nextInt();
		System.out.print("\n enter a selling price \n");
		Scanner abc = new Scanner (System.in);
		sp = abc.nextInt();
		String s = (sp>cp) ? "profit" : "loss";
		System.out.print(s);
	}
	
}