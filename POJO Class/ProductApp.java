/*WAP to create class name as Product with field id,name and price with setter and getter methods and we have one more class name as Shop with two methods 
void addNewProduct(Product prod)
void showProduct()
*/
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
class Shop
{
	private Product p1;
	void addNewProduct(Product product)
	{
		p1 = product;
	}
	void showProduct()
	{
		System.out.println(p1.getid()+"\t"+p1.getname()+"\t"+p1.getprice());
	}
}
public class ProductApp
{
	public static void main(String x[])
	{
		Shop s = new Shop ();
		Product p = new Product();
		p.setid(1);
		p.setname("Mobile - Realme");
		p.setprice(15000);
		s.addNewProduct(p);
		s.showProduct();
	}
}