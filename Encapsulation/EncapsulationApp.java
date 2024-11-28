/*Suppose we are working of billing application and we want to give the 25% discount on bill only for employee of shop otherwise not.
*/
class Bill
{
	private int qty;
	private int rate;
	private String usertype;
	private int total;
	
	public void setqty(int qty)
	{
		this.qty=qty;
	}
	public int getqty()
	{
		return qty;
	}
	public void setrate(int rate)
	{
		this.rate=rate;
	}
	public int getrate()
	{
		return rate;
	}
	public void setusertype(String usertype)
	{
		this.usertype = usertype;
	}
	public int gettotal()
	{
		if(usertype.equals("employee"))
		{
			return(qty*rate)-(qty*rate)*25/100;
		}
		else
		{
			return qty*rate;
		}
	}
}
public class EncapsulationApp
{
	public static void main(String x[])
	{
		Bill b = new Bill();
		b.setqty(10);
		b.setrate(100);
		b.setusertype("employee");
		int total = b.gettotal();
		System.out.printf("Total is %d",total);
	}
}