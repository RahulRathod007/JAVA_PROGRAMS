/*WAP to create class name as Circle with two methods 
void setRadius(float radius):  this method help us to accept radius as parameter 
void calArea(): this method can calculate area of circle and display it.
*/
import java.util.*;
class Circle 
{
	float pi=3.14f,radius;
	void setradius(float x)
	{
		radius = x;
	}
	void CalArea()
	{
		System.out.printf("Area of Circle is %.2f",pi*radius*radius);
	}
}
public class AreaOfCircle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n enter a radius \n");
		float radius = xyz.nextFloat();
		Circle c = new Circle();
		c.setradius(radius);
		c.CalArea();
	}
}