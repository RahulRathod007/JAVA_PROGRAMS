/* WAP to Create class name as Employee with field id,name and sal with setter and getter method and create one class name as Company with two methods 
void addnew employee(Employee employee): this function can accept employee as parameter 
void showemployee(): this function can access the employee detail and display it.
*/
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
class Company
{
	private Employee emp;
	void setaddnewEmployee(Employee employee)
	{
		emp = employee;
	}
	void showEmployee()
	{
		System.out.println(emp.getid()+"\t"+emp.getname()+"\t"+emp.getsal());
	}
}
public class PojoEmployeeApp
{
	public static void main(String x[])
	{
		Company c = new Company();
		Employee e = new Employee();
		e.setid(1);
		e.setname("Rahul");
		e.setsal(20000);
		c.setaddnewEmployee(e);
		c.showEmployee();
	}
}
