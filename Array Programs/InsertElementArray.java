//WAP to insert the element on specified position in array?
import java.util.*;
public class InsertElementArray
{
	public static void main(String x[])
	{
		int a[] = new int[5];
		int value , index;
		Scanner xyz = new Scanner(System.in);
		for(int i=0;i<a.length-1;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("\n Display Array values before Inserting value \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]); 
		}
		
		System.out.println("\n enter a value want to be inserted \n");
		value = xyz.nextInt();
		System.out.println("\n enter a index where you want to insert value \n");
		index = xyz.nextInt();
		
		for(int i=a.length-2;i>=index;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=value;
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}
		/*
		for(int i=0;i<a.length;i++){
			if(i==index-1){
				for(int j=a.length-1;j>index-1;j--){
					a[j]=a[j-1];
				}
			a[index-1]=value;
			}
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d\t",a[i]);
		}
	*/
 
	