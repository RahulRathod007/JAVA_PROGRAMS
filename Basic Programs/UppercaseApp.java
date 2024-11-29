//Write a java program to check whether a character is uppercase or lowercase alphabet.
import java.util.*;
public class UppercaseApp
{
	public static void main( String x[])
	{
	 char ch;
	 System.out.println("\n enter a character \n");
	 Scanner xyz = new Scanner (System.in);
	 ch = xyz.next().charAt(0);
	 String s = (ch>='A'&& ch<='Z') ? "Uppercase" :"Lowercase";
	 System.out.println(s);
	}
}
