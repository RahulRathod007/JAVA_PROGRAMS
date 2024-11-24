//find Missing elements form array..condtion passed array sorted without sorted can't find
import java.util.*;
public class FindMissingElementApp
{
   public static void main(String x[])
   {	
		int a[]= new int[5];
		Scanner xyz = new Scanner(System.in);
		System.out.println(" enter a values in Array \n");
		for(int i=0;i<a.length;i++)
		{
		  a[i]= xyz.nextInt();
		}
		System.out.println("Display Array Values \n");
		for(int i=0;i<a.length;i++)
		{
		  System.out.printf(" %d\t" , a[i]);
		}
		// Mising logics
		System.out.println("\n Missing Elements are \n");
		for(int i=0;i<a.length-1;i++)
		{ 
			for(int j=a[i]+1; j<a[i+1]; j++)
			{
				System.out.println(+j);
			}
		}
		/*
		for(int i=0;i<a.length-1;i++)
		{
			int diff = a[i+1]-a[i];
			if(diff>1)
			{	int count=a[i];
				while(count<a[i+1]-1)
				{   ++count;
					System.out.printf("%d \t",count);
				}
			}
		}
		*/
   }
}