import java.util.*; //package
public class STwoFirst  //class name
{
	public static void main(String x[])
	{
		Scanner xyz= new Scanner(System.in); //for input 
		int a[] = new int[8];
		System.out.println("Enter values in Array \n"); // input values // 0 1 3 4 5 6 7 9
		for(int i=1;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array values \n"); 
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]); //Display values
		}
		//logics  
		System.out.println("\nDisplay Missing Element \n");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1; j<a[i+1];j++)
			{
				System.out.print(" "+j);
				break;
			}
		}
		
	}
}