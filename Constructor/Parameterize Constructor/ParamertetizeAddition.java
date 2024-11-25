//Paramertetize Constructor Additon 
class Add
{
	Add(int x , int y)
	{
		System.out.printf("Addition is %d",x+y);
	}
}
public class ParamertetizeAddition
{
	public static void main(String x[])
	{
		Add a1 = new Add(10,20);
	}
}