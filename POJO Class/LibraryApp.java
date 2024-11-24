/*WAP to Create class name as Book with field id,name and price with setter and getter method and create one class name as Library with two methods 
void addNewBook(Book book): this function can accept book as parameter 
void showBook(): this function can access the book detail and display it.
*/
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
class Library
{ 
	private Book b1;
	void addnewBook(Book book)
	{
		b1=book;
	}
	void showBook()
	{
		System.out.println(b1.getid()+"\t"+b1.getname()+"\t"+b1.getprice());
	}

}
public class LibraryApp
{
	public static void main(String x[])
	{
		Library l = new Library();
		Book b = new Book();
		b.setid(1);
		b.setname("Atomic Habits");
		b.setprice(250);
		l.addnewBook(b);
		l.showBook();
	}
}