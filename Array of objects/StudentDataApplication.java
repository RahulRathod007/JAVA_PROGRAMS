/*WAP to create POJO class name as Student with field id,name and per and create array of object student with size 5 and input the id of student and search student record in student object array and if student then display student found otherwise display message student not found.
*/
import java.util.*;
class Student
{
	private int id;
	private String name;
	private float per;
	
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
	public void setper(float per)
	{
		this.per=per;
	}
	public float getper()
	{
		return per;
	}
}
public class StudentDataApplication
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner (System.in);
		Student s[] = new Student[5];
		for(int i=0;i<s.length;i++)
		{
		s[i] = new Student();
		System.out.println("\n Enter id name and percentage \n");
		int id = xyz.nextInt();
		xyz.nextLine();
		String name = xyz.nextLine();
		float per = xyz.nextFloat();
		s[i].setid(id);
		s[i].setname(name);
		s[i].setper(per);
		}
		System.out.println("=====================================");
		System.out.println("ID\tNAME\tPERCENTAGE");
		System.out.println("=====================================");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getid()+"\t"+s[i].getname()+"\t"+s[i].getper());
		}
		System.out.println("=====================================");
		
		//search id logics.
		System.out.println("\n Enter Student ID for Search \n");
		int Search = xyz.nextInt();
		int flag=0;
		for(int i=0;i<s.length;i++)
		{
			if(Search==s[i].getid())
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("\n ID Found \n ");
		}
		else
		{
			System.out.println("\n ID Not Found \n");
		}
	}
}