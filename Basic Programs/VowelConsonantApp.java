//Wap program in java to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class VowelConsonantApp
{
  public static void main(String x[])
  {
    char ch;
	System.out.print("\n enter a character \n");
	Scanner xyz = new Scanner(System.in);
	ch = xyz.next().charAt(0);
	String s=(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') || 
	(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')?"Vowel":"Consonant";
	System.out.printf(s);
  }
}