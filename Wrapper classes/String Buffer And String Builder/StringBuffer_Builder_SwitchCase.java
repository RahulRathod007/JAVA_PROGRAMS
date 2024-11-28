//Wap to Perform all Operations On string using String Buffer And String builder class 

import java.util.*;
public class StringBuffer_Builder_SwitchCase
{
	public static void main(String x[])
	{
		System.out.println("1.Reverse a String ");
		System.out.println("2.Inserting Characters");
		System.out.println("3.Appending String ");
		System.out.println("4.Deleting Character From String ");
		System.out.println("5.Replace a Substring ");
		System.out.println("6.Check Capacity, Ensure Capacity from stringbuffer class");
		System.out.println("7.Demostreat Chaining methods by using StringBuffer");
		
		int choice;
		Scanner xyz = new Scanner (System.in);
		choice = xyz.nextInt();
		switch (choice)
		{
			case 1: 
			{		
					//Reverse String.
					System.out.println("Enter a String \n");
					Scanner abc = new Scanner(System.in);
					String str = abc.nextLine();
					
					StringBuffer sb = new StringBuffer(str);
					sb.reverse();
					System.out.println(sb);
					break;
			}
			case 2: 
			{		
					//Inserting character.
					StringBuffer s = new StringBuffer (" My Name is :");
					System.out.println(" Before Insert \n"+s);
					s.insert(12,"Rahul");
					System.out.println(" After Insert \n"+s);
					break;
			}
			case 3:
			{
					//Append String.
					StringBuffer sb = new StringBuffer("Good");
					System.out.println("Before Append \n"+sb);
					sb.append(" Morning ");
					System.out.println("After Append \n"+sb);
					break;
			}
			case 4:
			{
					StringBuffer sb = new StringBuffer("Very Good Mornig India");
					System.out.println("Before Delete -----\n"+sb);
					sb.delete(0,5);
					System.out.println("After Delete -----\n"+sb);
					break;
			}
			case 5:
			{		StringBuffer sb = new StringBuffer("Rahul Rathod");
					break;
			}
			case 6:
			{		StringBuffer sb = new StringBuffer("");
					System.out.println("Initial Capacity = "+sb.capacity());
					sb.ensureCapacity(60);
					System.out.println("Ensure Capacity "+sb.capacity());
					break;
			}
			case 7:
			{		StringBuffer sb= new StringBuffer("Rahul s");
					System.out.println("Before Append  "+sb);
					sb.append(" Rathod ");
					System.out.println("After Append  "+sb);
					System.out.println("Before Insert "+sb);
					sb.insert(0," Mr.");
					System.out.println("After Insert "+sb);
					System.out.println("Before Delete "+sb);
					sb.delete(10,11);
					System.out.println("After Delete "+sb);
					break;
			}
			default :
			{
			System.out.println("Invalid Choice Input");
			}
		}
	}
} 
