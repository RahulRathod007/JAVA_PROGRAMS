import java.util.*;
class Employee
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
public class EmployeeArrayOfObject
{
	public static void main(String x[])
	{
		Employee emp[] = new  Employee[5]; //array of reference.
		for(int i=0;i<emp.length;i++)
		{
			Scanner xyz = new Scanner(System.in);
			emp[i] = new Employee(); //array of objects.
			System.out.println("\n Enter id name salary \n");
			int id = xyz.nextInt();
			xyz.nextLine();
			String name = xyz.nextLine();
			int sal = xyz.nextInt();
			
			emp[i].setid(id);
			emp[i].setname(name);
			emp[i].setsal(sal);
			
		}
		System.out.println("\n Display All Employee Data \n");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].getid()+"\t"+emp[i].getname()+"\t"+emp[i].getsal());
		}
