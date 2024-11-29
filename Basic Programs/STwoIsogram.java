import java.util.*;   //package
public class STwoIsogram // class name
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner (System.in);  // for input we use scanner class
		int a[] = new int[5];    //declare array of size 5
		int flag=0;
		System.out.println("Enter values in Array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt(); // storing array values.
		}
		System.out.println("Display Array values");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]); //display array values.
		}
		//logics 
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])  //condition
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("\n Not Isogram Array");
		}
		else
		{
			System.out.println("\n Isogram Array");
		}
	}
}