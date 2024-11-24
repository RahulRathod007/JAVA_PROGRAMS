// create the class name as ConvertToUpper with a following methods 
class ConvertToUpper
{
	char ch[];
	void setCharArray(char ch[])
	{
		this.ch=ch;
	}
	void ConvertToUppercase()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i] = (char)(ch[i]-32);
				System.out.print(ch[i]);
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
	}
}
public class ConvertToUpperApplication
{
		public static void main(String x[])
		{
			//char ch [] ={'r','a','h','u','l'};   or
			char ch [] = "rahul".toCharArray();
			ConvertToUpper c1 = new ConvertToUpper();
			c1.setCharArray(ch);
			c1.ConvertToUppercase();
		}
}