/*Example: WAP to create class name as Square with two functions
void setValue(int x): this function accept integer as parameter
void showSquare(): this function can calculate square and display it.
*/
import java.util.*;
class Square 
{
 int no ;
 void setsquare(int x)
 {
	no = x;
 }
 void getsquare()
 {
	System.out.printf("\n Square is %d ",no*no);
 }
}
public class SquareApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n Enter a number \n");
		int no = xyz.nextInt();
		Square sq = new Square();
		sq.setsquare(no);
		sq.getsquare();
	}
}