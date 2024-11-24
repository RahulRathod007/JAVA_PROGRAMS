//WAP to create the class name as Student with a following methods 
import java.util.*;
class Student
{
	int s[];
	int agg =0;
	int per;
	void setsubmarks(int s[])
	{
		this.s=s;
	}
	void calculateper()
	{
		for(int i=0;i<s.length;i++)
		{
			agg = agg + s[i];
		}
		System.out.printf("\n Total Subject Marks = %d/600",agg);
		per = agg/6;
		System.out.printf("\n Percentage is %d ",per);
	}
	void checkGrades()
	{
		if(per>75 && per<=100)
		{
			System.out.println("\n Student in Distiction \b");
		}
		else if (per>60 && per<=75)
		{
			System.out.println("\n Student in First Division \b");
		}
		else if(per>=50 && per<=60)
		{
			System.out.println("\n Student in Second Division \b");
		}
		else if(per>40 && per<=50)
		{
			System.out.println("\n Student in Third Division \b");	
		}
		else
		{
			System.out.println("\n Student is Failed \b");
		}
	}
}
public class StudentGradeApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int s[] = new int[6];
		System.out.println("\n Enter Six Subject Marks \n");
		for(int i=0;i<s.length;i++)
		{
			s[i] = xyz.nextInt();
		}
		Student s1 = new Student();
		s1.setsubmarks(s);
		s1.calculateper();
		s1.checkGrades();
	}
}