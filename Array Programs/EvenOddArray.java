/*Wap input 10 size of array and seperate all even and odd number into another array and display it.
*/
import java.util.*;
public class EvenOddArray
{
	public static void main(String x[])
	{ 
		int a[] = new int[10];
		int i;
		Scanner xyz = new Scanner(System.in);
		System.out.println("\n Enter a Array values \n");
		for(i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Orirginal Array \n");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("\n\nEven Numbers : ");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{    
				System.out.printf("%d\t",a[i]);		 
			}
		}
		System.out.println("\n\n Odd Numbers : ");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.printf("%d\t",a[i]);
			}
		}		
	}
}
	