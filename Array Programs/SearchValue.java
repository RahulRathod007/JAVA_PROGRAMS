//WAP to create array of size 5 and input single value from keyboard and search value //present in array or not?
import java.util.*;
public class SearchValue
{
	public static void main(String x[])
	{
	   Scanner xyz = new Scanner(System.in);
	   int len,skey;
	   int flag = 0;
	   System.out.println("Enter a length of array \n");
	   len = xyz.nextInt();
	   int a[] = new int[len];
	   System.out.println("enter Array values \n");
	   for(int i=0;i<a.length;i++)
	   {
	     a[i]=xyz.nextInt();
	   }
	   for(int i=0;i<a.length;i++)
	   {
	     System.out.printf("%d\t",a[i]);
	   }
	   System.out.println("\n Enter a searchkey value \n");
	   skey = xyz.nextInt();
	   for(int i=0;i<=a.length-1;i++)
	   {
			if(skey==a[i])
		    {
			   flag = 1;
			   break;
			}
	   }
	   if(flag==1)
	   {
		  System.out.println(" value Found \n");
	   }
	   else
	   {
		   System.out.println(" Value not Found \n");
	   }
	}
}