 //WAP to create the class name as Circle with a following methods
 class Circle
 {
	float Radius;
	float pi = 3.14f;
	void setRadius(float Radius)
	{
		this.Radius=Radius;
	}
	void ShowArea()
	{
		float Area = pi*Radius*Radius;
		System.out.printf("Area of Circle is %f",Area);
	}
 }
 public class CircleAreaApp
 {
		public static void main(String x[])
		{
			Circle c = new Circle();
			c.setRadius(3);
			c.ShowArea();
		}
 }
 