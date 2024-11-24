//Write a program to delete an element at desired position from an array.  
import java.util.*;
public class DeleteElementArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		int index;
		System.out.println("\n Enter a array values \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("\n Display Array values \n");
		for(int i=0;i<a.length;i++)
		{								   // 0 1 2 3 4
			System.out.printf("%d\t",a[i]); //1 2 4 5 3
		}
		System.out.println("\n Enter a index of element which want to be delete \n");
		index = xyz.nextInt(); //2
		for(int i=index;i<a.length-1;i++)//i=2,2<4;i++
		{       
			while(i<a.length-1) //2<4
			{
				a[i] = a[i+1]; //a[2]=a[3]
				i++;  //a[3]==a[4];  
			} 
		}
		System.out.println("\n After deleting index \n");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}