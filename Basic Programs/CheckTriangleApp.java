//Write a java program to check whether triangle is equilateral , isoscale  or scalene.
import java.util.*;
public class CheckTriangleApp
{
  public static void main(String x[])
  {
    int s1,s2,s3;
	System.out.print("\n enter a first angle of triangle \n");
	Scanner xyz = new Scanner (System.in);
	s1 = xyz.nextInt();
	System.out.print("\n enter a second angle of triangle \n");
	Scanner abc = new Scanner (System.in);
	s2 = abc.nextInt();
	System.out.print("\n enter a third angle of triangle \n");
	Scanner pqr = new Scanner (System.in);
	s3 = pqr.nextInt();
	String s = (s1==s2 && s2==s3 ) ? "Equilateral Triangle" : 
	(s1==s2  || s2==s3  || s1==s3)?"isoscale Triangle" : " Scalene Triangle";
	System.out.println(s);
  }
}