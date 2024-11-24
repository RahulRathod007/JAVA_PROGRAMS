//Create the Class Name as Rectangle with a following methods and write its logics. 
class Rectangle
{
	int Length;
	int Width;
	void SetLengthWidth(int Length , int Width)
	{
		this.Length=Length;
		this.Width=Width;
	}
	void ShowArea()
	{
		int Area = Length * Width;
		System.out.printf("Area of Rectangle is %d",Area);
	}
}
public class RectangleAreaApp
{
	public static void main(String x[])
	{
		Rectangle R = new Rectangle();
		R.SetLengthWidth(5,10);
		R.ShowArea();
	}
}