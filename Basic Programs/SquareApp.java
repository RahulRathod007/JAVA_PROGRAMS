import java.util.*;
public class SquareApp
{
   public static void main(String x[])
   {
      Scanner xyz = new Scanner(System.in);
	  int no,sq;
	  System.out.printf("Enter a number \n");
	  no = xyz.nextInt();
	  sq = no * no;
	  System.out.printf("Square is %d",sq);
   }
}