//Garbage Collection
class Employee
{
	static String Company_Name = "ABC";
	int id;
	String name;
	int sal;
}
public class EmpGarbage
{
	public static void main(String x[])
	{
		Employee emp1 = new Employee();
		emp1.id = 1;
		emp1.name ="Ram";
		emp1.sal = 1000;
		
		Employee emp2 = new Employee();
		emp2.id = 2;
		emp2.name ="Shyam";
		emp2.sal = 2000;
		
		emp1 = null;
	}
}