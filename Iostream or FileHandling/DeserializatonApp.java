//Deserializaton Example With Source Code.
import java.io.*;
class Employee implements Serializable
{
	private int id;
	private String name;
	private int sal;
	
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
		return  name;
	}
	public void setsal(int sal)
	{
		this.sal=sal;
	}
	public int getsal()
	{
		return sal;
	}
}
public class DeserializatonApp
{
	public static void main(String x[])throws Exception
	{
		FileInputStream fin = new  FileInputStream ("G:\\C PROGRAM TECH HUB\\JAVA\\Iostream or FileHandling\\Demoemp.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Employee e = (Employee)oin.readObject();
		System.out.println("\n"+e.getid()+"\t"+e.getname()+"\t"+e.getsal());
		System.out.println("\nSuccess.......");
	}
}