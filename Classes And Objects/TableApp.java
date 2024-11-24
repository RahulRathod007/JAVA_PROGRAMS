/*WAP to create class name as Table with two methods 
void setNum(int no): this method can accept number as parameter 
void showTable(): this method can calculate table of number and display it
*/
import java.util.*;
class Table
{
	int no;
	void setdata(int x)
	{
		no = x;
	}
	void ShowTable()
	{	
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d\n",no*i);
		}
	}
}
public class TableApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.printf("\nenter a Number : ");
		int no = xyz.nextInt();
		Table T = new Table();
		T.setdata(no);
		T.ShowTable();
	}
}