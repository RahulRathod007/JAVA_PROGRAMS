//Serialiazaion Example with Source code
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
		return name;
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
public class SerializableApp
{
	public static void main(String x[])throws Exception
	{
		FileOutputStream fout = new FileOutputStream("G:\\C PROGRAM TECH HUB\\JAVA\\Iostream or FileHandling\\Demoemp.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		Employee emp1  = new Employee ();
		emp1.setid(1);
		emp1.setname("ABC");
		emp1.setsal(1000);
		oout.writeObject(emp1);
		oout.close();
		System.out.println("File Save Success.......");
	}
}