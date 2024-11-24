// WAP to create the class Employee with a following methods.
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int basicsal;
	private int progress;
	private int psal;
	void SetPersonalInfo(int id , String name , int basicsal)
	{
		this.id=id;
		this.name=name;
		this.basicsal=basicsal;
	}
	void setProgressper( int progress)
	{
		this.progress=progress;
		if(progress > 60)
		{
			psal = basicsal + basicsal*(30/100);
		}
	}
	void Show()
	{
		System.out.printf("\n-----------------\n");
		System.out.println("name \t id\t Bsal\t Psal\t");
		System.out.println(name+"\t"+id+"\t"+basicsal+"\t"+psal);
		
	}
}
public class EmployeeProgressApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter Id name And Basicsal of Employee \n");
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int basicsal = sc.nextInt();
		Employee emp = new Employee();
		emp.SetPersonalInfo(id,name,basicsal);
		System.out.println("\n Enter a progress Value \n");
		int progress = sc.nextInt();
		emp.setProgressper(progress);
		emp.Show();
	}
}