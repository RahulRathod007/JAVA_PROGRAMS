//WAP to input number from keyboard and check number is even or odd 
public class EvenOddCmd
{
   public static void main(String x[])
   {
		int no = Integer.parseInt(x[0]);
		if(no%2==0)
		{
		  System.out.println("number is even");
		}
		else
		{
		 System.out.println("number is odd");
		}
   }
}