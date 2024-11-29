//WAP to input radius from keyboard and calculate area of circle.
public class AreaCmd
{
	public static void main(String x[])
	{
		float radius,area,pi=3.14f;
		radius = Float.parseFloat(x[0]);
		area = radius * radius * pi;
		System.out.printf("Area is %f",area);
	}
}