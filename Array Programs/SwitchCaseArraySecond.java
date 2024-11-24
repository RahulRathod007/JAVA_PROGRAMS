/* 
wap to input a 10 size mobile number into array and hide digit by special character '#' by using following operations.
case 1 : ######7604
case 2 : 8766######
case 3 : 876####604
case 4 : ###6447###
case 5 : 8#6#4#7#0#
case 6 : #7#6#4#6#4
*/
import java.util.*;
public class SwitchCaseArraySecond
{
	public static void main(String x[])
	{
		int a[] = new int[10];
		Scanner xyz = new Scanner(System.in);
		int choice;
		System.out.print("case 1 : ######7604 \n");
		System.out.print("case 2 : 8766###### \n");
		System.out.print("case 3 : 876####604 \n");
		System.out.print("case 4 : ###6447### \n");
		System.out.print("case 5 : 8#6#4#7#0# \n");
		System.out.print("case 6 : #7#6#4#6#4 \n");
		System.out.print("\nEnter Mobile Number \n");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("\n Display Mobile Number \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print( " "+a[i]);
		}
		System.out.print("\n\n Enter your choice ");
		choice = xyz.nextInt();
		switch (choice)
		{
			case 1 : for(int i=0;i<a.length;i++)
					{
						if(i<6)
						{
							System.out.printf("#");
						}
						else
						{
							System.out.printf("%d",a[i]);
						}
							
					}
			case 2 : for(int i=0;i<a.length;i++)
					{
						if(i<4)
						{
							System.out.printf("%d",a[i]);
						}
						else
						{
							System.out.printf("#");
						}
					}
			case 3 : for(int i=0;i<a.length;i++)
					{
						if(i>=3 && i<7)
						{
							System.out.printf("%d",a[i]);
						}
						else
						{
							System.out.printf("#");
						}
					}
			case 4 : for(int i=0;i<a.length;i++)
					{
						if(i>=3 && i<7)
						{
							System.out.printf("#");
						}
						else
						{
							System.out.printf("%d",a[i]);
						}
					}
			case 5 : for(int i=0;i<a.length;i++)
					{
						if(i%2==0)
						{
							System.out.printf("%d",a[i]);
						}
						else
						{
							System.out.printf("#");
						}
					}
			case 6 : for(int i=0;i<a.length;i++)
					{
						if(i%2==0)
						{
							System.out.printf("#");
						}
						else
						{
							System.out.printf("%d",a[i]);
						}
					}
		}
	}
}