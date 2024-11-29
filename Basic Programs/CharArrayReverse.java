import java.util.*;
public class CharArrayReverse
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String ");
		String ch = xyz.nextLine();
		//How to reverse Words in a sentences without using a Library Function .... "Rahul Rathod  ------> Rathod Rahul"
		/*
		for(int i=ch.length()-1;i>=0;i--)
		{
			int j=i;
			while(j>=0 && ch.charAt(j)!=' ')
			{
				j--;
			}
			for(int k=j+1;k<=i;k++)
			{
				System.out.printf("%s",ch.charAt(k));
			}
			System.out.print(" ");
			i=j;
		}
		*/
		//How to reverse Words in a sentences without using a Library Function .... "Rahul Rathod  ------> LuharR dohtaR"	
		for(int i=0;i<ch.length();i++)
		{
			int j=i;
			while(j<ch.length() && ch.charAt(j)!=' ')
			{
				j++;
			}
			for(int k=j-1;k>=i;k--)
			{
				System.out.printf("%s",ch.charAt(k));
			}
			// if(j<ch.length())
			// {
				 System.out.printf(" ");
			// }
			i=j;
			System.out.printf(" ");
		}
	}
}