//Example: WAP to input two strings s1=”abc”  and s2=”mno” and merge them as alternatively 
//Output: ambnco
import java.util.*;
public class Alternatively_Merge_String
{
	public static void main(String x[])
	{
		 String first,second;
		 Scanner xyz  = new Scanner(System.in);
		 System.out.println("Enter data in first string");
		 first=xyz.nextLine();
		 System.out.println("Enter data in second string");
		 second=xyz.nextLine();
		 
		 StringBuffer sb = new StringBuffer();
		 int limit=0,max;
		 String str="";
		   
			if(first.length()>second.length())
			{
			limit=second.length();
			max=first.length();
			str=first;
		   }
		   else
		   {
			    limit=first.length();
				max=second.length();
				str=second;
		   }
		     for(int i=0;i<limit;i++)
			 {
			     char f=first.charAt(i);
				  sb.append(f);
				 char s=second.charAt(i);
				  sb.append(s);
			 }
			 for(int k=i;k<max;k++)
			 {  char m=str.charAt(k);
		         sb.append(m);
			 }
			 System.out.println(sb);

	}
}