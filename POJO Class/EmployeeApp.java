import java.util.*;
class Employee
{
	private int id;
	private String name;
	private  int sal;
	
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
public class EmployeeApp
{
	public static void main(String x[])
	{   Scanner sc=new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("\nEnter Id:");
		int id=sc.nextInt();
		System.out.print("\nEnter Name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.print("Enter Salary");
		int sal=sc.nextInt();
		
		emp.setid(id);
		emp.setname(name);
		emp.setsal(sal);
		
		System.out.print("\nId:"+emp.getid());
		System.out.print("\nName:"+emp.getname());
		System.out.print("\nSalary:"+emp.getsal());
	}
}