//Array Index Out Of Bounds Exception
public class ArrayIndexOutOfBoundsApp
{
	public static void main(String x[])
	{
		try
		{
			int a[] = new int[2];
			a[0] = 10;
			a[1] = 20;
			a[2] = 200;
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBounds ex)
		{
			System.out.println("index value greater than array size");
			System.out.println("Error is "+ex);
		}
		System.out.println("Logic 1");
		System.out.println("Logic 2");
		
	}
}