//WAP to input number from keyboard using command line argument and print its table.
public class TableCmd
{
 public static void main(String x[])
 {
    int no = Integer.parseInt(x[0]);
	for(int i=1;i<=10;i++)
	{
	  System.out.printf("%d\n",no*i);
	}
 }
}