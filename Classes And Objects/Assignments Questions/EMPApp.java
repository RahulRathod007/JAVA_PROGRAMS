/*WAP to create the class name as Employee class and create the array object of Employee class of size 5 and store all data in it and delete the specified employee data using employee id 
*/
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
public class EMPApp
{
	public static void main(String x[])
	{
		Employee emp[] = new Employee[5]; //array of reference.
		Scanner xyz = new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			emp[i] = new Employee(); //array of object.
			System.out.println("\n Enter ID Name And Salary \n");
			int id = xyz.nextInt();
			xyz.nextLine();
			String name = xyz.nextLine();
			int sal = xyz.nextInt();
			
			emp[i].setid(id);
			emp[i].setname(name);
			emp[i].setsal(sal);
		}
		System.out.println("================================");
		System.out.println("ID\tNAME\tSALARY");
		System.out.println("================================");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].getid()+"\t"+emp[i].getname()+"\t"+emp[i].getsal());
		}
		System.out.println("================================");
	}
}
