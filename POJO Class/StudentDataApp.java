/*WAP to Create class name as Student with field id,name,marks[] with setter and getters means 
void setId(int): accept id as parameter
int getId(): return id as parameter
void setName(String name): this method can accept name as parameter
String getName(): return name as parameter
void setMarks(int marks[]): this method can accept marks of six subject 
int [] getMarks(): this method can return marks of six subjects
and you have to create one more class name as FindPer with two methods 
void setStudent(Student student): this method accept student reference as parameter 
void showStudent(): this method can show the student data using reference of student 
float getPer(): this method can access six subject marks of student and calculate its percentage and return it.
*/
class Student
{
	private int id;
	private String name;
	private int marks;
	
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
	public void setmarks(int marks)
	{
		this.marks=marks;
	}
	public int getmarks()
	{
		return marks;
	}
}
class FindPer
{
	private Student s1[];
	void setStudent(Student ...s1)
	{
		System.out.println("id\t name\t marks");
		for(int i=0;i<s1.length;i++)
		{
			System.out.printf(s1[i].getid()+"\t"+s1[i].getname()+"\t"+s1[i].getmarks());
		}
	}
}
public class StudentDataApp
{
	public static void main(String x[])
	{
		FindPer F = new FindPer();
		
		Student s1 = new Student();
		s1.setid(1);
		s1.setname("Rahul");
		s1.setmarks(95);
		
		Student s2 = new Student();
		s2.setid(2);
		s2.setname("Sakshi");
		s2.setmarks(90);
		F.setStudent(s1,s2);
	}
}