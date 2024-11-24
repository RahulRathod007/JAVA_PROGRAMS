//.WAP to create the class name as Seller with a following functions 
import java.util.*;
class Seller
{
		int cp,sp;
		void SetCostSelling(int cp , int sp)
		{
			this.cp=cp;
			this.sp=sp;
		}
		void ShowProfitLoss()
		{
			if(sp>cp)
			{
				System.out.println("\n PROFIT \n");
			}
			else
			{
				System.out.println("\n LOSS \n");
			}
		}
}
public class SellerApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n Enter Cost Price \n");
		int cp = xyz.nextInt();
		System.out.println("\n Enter Selling Price \n");
		int sp = xyz.nextInt();
		Seller s = new Seller();
		s.SetCostSelling(cp,sp);
		s.ShowProfitLoss();
	}
}