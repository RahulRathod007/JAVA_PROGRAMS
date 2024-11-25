/* WAP to create class  with one parameterized constructor and one method 
LenCount(char[]): this constructor accept character array as input
int getLength(): this method return length of character array. */
import java.util.*;
class CountLength
{
	char ch[];
	int  count=0;
	//int len = 0;
	CountLength(char ch[])
	{
		this.ch=ch;
	}
	
	int getLength()
	{
	 //len=ch.length;
	 for(int i=0;i<ch.length;i++)
	 {
		 count++;
	 }
	  return count;
	}
}
public class characterArrayLength
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		char ch []=new char[6];
		System.out.println("\n Enter Character Array \n");
		for(int i=0;i<ch.length;i++)
		{
			ch[i] = xyz.next().charAt(0);
		}
		CountLength c = new CountLength(ch);
		int result = c.getLength();
		System.out.printf(" Length of character Array is %d",result);
	}
}