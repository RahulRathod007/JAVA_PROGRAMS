/* WAP to Create class ConvertToUpperOnEvenPosition with one constructor and method
ConvertToUpperOnEvenPosition(char[]): we have to pass character array as parameter 
void convert(): this method can convert even position character in upper case 
char [] getConvertedArray(): this method can return array after conversion.*/
import java.util.*;
class ConvertToUpperOnEvenPosition
{	char ch[];
	ConvertToUpperOnEvenPosition(char ch[])
	{
		this.ch=ch;
	}
	void convert()
	{
		for(int i=0;i<ch.length;i++)
		{
			   if( i%2==0 && ch[i]>='a' && ch[i]<='z')
			   {
				  ch[i] = (char)(ch[i]-32);
			   }
		}
	}
	// void convertusingfunction()
	// {
		// for(int i=0;i<ch.length;i++)
		// {
			// if(i%2==0)
			// {
				// ch[i] = Character.toUpperCase(ch[i]);
			// }
		// }
	// }
	char [] getConvertedArray()
	{
		return ch;
	}
}
public class ConvertToUpperOnEvenPositionApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		char ch[] = new char[5];
		System.out.println("Enter Character Array \n");
		for(int i=0;i<ch.length;i++)
		{
			ch[i] = xyz.next().charAt(0);
		}
		ConvertToUpperOnEvenPosition c1 =  new ConvertToUpperOnEvenPosition(ch);
		c1.convert();
		char ans[] = c1.getConvertedArray();
		for(int i=0;i<ans.length;i++)
		{
			System.out.print("\t"+ans[i]);
		}
		
	}
}