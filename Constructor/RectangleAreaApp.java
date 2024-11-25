/*Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is 'length*breadth' 
The class has three constructors which are : 
1 - having no parameter - values of both length and breadth are assigned zero. 
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively. 
3 - having one number as parameter - both length and breadth are assigned that number. Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas. */
class Rectangle
{
	int length,breadth;
	Rectangle()
	{   this(2,3);
		length =0;
		breadth=0;
		System.out.println("Area "+(length*breadth));
	}
	Rectangle(int length , int breadth)
	{   this(2); 
		this.length=length;
		this.breadth=breadth;
		System.out.println("Area "+(length*breadth));
	}
	Rectangle (int length)
	{
		System.out.println("Area is"+(length*length));
	}
}
public class RectangleAreaApp
{
	public static void main(String x[])
	{
		Rectangle R1 = new Rectangle();
	}
}	
