/*Wap in java to create abstract class name as palindrome with two functions  setString(String s) and ispalindrome().
and create one more class checkpalindrome and those class extends with plindrome class and overide methods. */
abstract class Palindrome
{
	String s;
	setString(String s)
	{
	this.s=s;
	}
	abstract void ispalindrome();
}
class checkpalindrome extends Palindrome
{
	void ispalindrome()
	{
		String s [] =tocharArray();
		String s1 [] = new String [];
		
		for(int i=0;i<s.length;i++)
		{
			s2[i] = xyz.nextInt();
		}
		int mid = length/2;
		int length = length-1;
		for(int i=0;i<s.length;i++)
		{
			String temp = s[i];
			s1[i] = last;
			last= s1[i];
			last--;
		}
		if(s==s1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
public class PalindromeString
{
	public static void main(String x[])
	{
		String s = {"rahul"};
		checkpalindrome c = new checkpalindrome();
		c.setString();
	}
}
