class Percentage
{	
	int s[],per=0;
	Percentage(int s[])
	{   int agg =0;
		for(int i=0;i<s.length;i++)
		{
			agg = agg + s[i];
		}
		per = agg /s.length;
	}
}
class CSE extends Percentage
{  
	String name;
	int id;
	String Address;
	String year;
	
	CSE(String name,int id,String Address,String year,int a[])
	{
		super(a);
		this.name=name;
		this.id=id;
		this.Address=Address;
		this.year=year;
	}
	void display()
	{
		System.out.println();
	System.out.printf("Id = %d\t Name = %s\t Address = %s\t Year = %s\t Percentage = %d",id,name,Address,year,per);
	}
}
class ETC extends Percentage
{
	String name;
	int id;
	String Address;
	String year;
	
	ETC(String name,int id,String Address,String year,int b[])
	{
		super(b);
		this.name=name;
		this.id=id;
		this.Address=Address;
		this.year=year;
	}
	void display()
	{
		System.out.println();
	System.out.printf("Id = %d\t Name = %s\t Address = %s\t Year = %s\t Percentage = %d",id,name,Address,year,per);
	}
}
public class ResultApp
{
	public static void main(String x[])
	{
		int a[] = {60,70,80,90,60};
		int b[] = {70,80,90,70,60};
		
		CSE c = new CSE("Rahul",1,"Pune","2024",a);
		c.display();
		ETC e = new ETC("Sakshi",2,"Pune","2024",b);
		e.display();
	}
}
