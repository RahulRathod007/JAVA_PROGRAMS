//wap to java program to input any character and check it 
//wheather alphabet ,digit or special character.
import java.util.*;
public class CharApp
{
  public static void main (String x[])
  {
     char ch;
	 System.out.print("\n enter a character ");
	 Scanner xyz= new Scanner(System.in);
	 ch = xyz.next().charAt(0);
	 String s= (ch>='a' || ch<='z') && ( ch<='A' || ch>='Z') ? "Alphabet":
	 ch>='0' && ch<='9' ? "Digit":"special Symbol";
	 System.out.println(s);
  }
}
