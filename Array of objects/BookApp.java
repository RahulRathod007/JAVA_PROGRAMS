/*WAP to create POJO class name as Book with field id,name and price and create 5 objects of book class using array of objects and arrange all books in descending order by using its price.
*/
import java.util.*;
class Book 
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
public class BookApp
{
 public static void main(String x[])
 {
	Book b[] = new Book[5]; //array of reference.
	for(int i=0;i<b.length;i++)
	{
		Scanner xyz = new Scanner(System.in);
		b[i] = new Book(); // array of objects.
		System.out.println("\n Enter id name and price \n");
		int id = xyz.nextInt();
		xyz.nextLine();
		String name = xyz.nextLine();
		int price = xyz.nextInt();
		b[i].setid(id);
		b[i].setname(name);
		b[i].setprice(price);
	}
	System.out.println("=====================================");
	System.out.println("id\tname\tprice");
	System.out.println("=====================================");
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i].getid()+"\t"+b[i].getname()+"\t"+b[i].getprice());
	}
	System.out.println("=====================================");
	
	System.out.println("\n Arrange All Books In Decending Order \n");
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i].getprice() < b[j].getprice())
			{
				Book temp = b[i];
				b[i] = b[j];
				b[j]= temp;
			}
			
		}
	}
	System.out.println("=====================================");
	System.out.println("ID\tNAME\tPRICE");
	System.out.println("=====================================");
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i].getid()+"\t"+b[i].getname()+"\t"+b[i].getprice());
	}
	System.out.println("=====================================");
 }
}