/*WAP to create class name as ExtractDigitAndSum with two functions 
void setValue(char[]): this function can accept character array as parameter 
int getSum(): this function can extract digit from number and calculate its sum and return it.
Example: abc123mno45
Output: 1+2+3+4+5 = 15
*/
class ExtractDigitAndSum
{ 
	char arr[];
	void setdata(char ch[])
	{
		arr = ch;
	}
	void showdata()
	{	int sum =0;
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]>='0' && arr[i]<='9')
				{
					sum = sum + arr[i]-48;
				}
		}
		System.out.printf("Addition of integer is %d",sum);
	}
}
public class ExtractDigitAndSumApp
{
	public static void main(String x[])
	{
		char ch[] = "abc123mno45".toCharArray();
		ExtractDigitAndSum E = new ExtractDigitAndSum();
		E.setdata(ch);
		E.showdata();
	}
}
