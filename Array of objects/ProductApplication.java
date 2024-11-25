/* WAP to Create class name as Product as POJO with field id,name and price create array of object of product of size 10 and find the product whose price is same.
*/
import java.util.*;
class Product
{
	private int id;
	private String name;
	private int price;
	
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setprice(int price)
	{
		this.price=price;
	}
	public int getprice()
	{
		return price;
	}
}
public class ProductApplication
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Product p[] = new Product[5];
		for(int i=0;i<p.length;i++)
		{
			p[i] = new Product();
			System.out.println("\n Enter ID Name And Price \n");
			int id = xyz.nextInt();
			xyz.nextLine();
			String name = xyz.nextLine();
			int price = xyz.nextInt();
			
			p[i].setid(id);
			p[i].setname(name);
			p[i].setprice(price);
		}
		
		System.out.println("=====================================");
		System.out.println("ID\tNAME\tPRICE");
		System.out.println("=====================================");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getprice());
		}
		System.out.println("=====================================");

		//same price logics.
		System.out.println("\n PRODUCT HAVING SAME PRICE \n");
		System.out.println("=====================================");
		System.out.println("ID\tNAME\tPRICE");
		System.out.println("=====================================");
		for(int i=0;i<p.length;i++)
		{	
				for(int j=i+1;j<p.length;j++)
				{
					if(p[i].getprice()==p[j].getprice());
					{
						System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getprice());
						System.out.println(p[j].getid()+"\t"+p[j].getname()+"\t"+p[j].getprice());
					}
				}
		}
		System.out.println("=====================================");
	}
}