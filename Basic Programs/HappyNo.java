//happy number
import java.util.*; 
class StrongNO
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number \n");
		int no = xyz.nextInt();
		int i=1;
		while(i<=no)
		{
			int temp =i;
			int res=1;
			while(temp!=0)
			{
				int rem = no%10;
				temp = temp/10;
				int calulate =1;
				for(int j=1;j<=rem;j++)
				{
					calulate = calulate*i;
				}
				sum = sum +calulate;
				if(sum ==no)
				{
					System.out.println(i);
				}
				i++;
			}
		}
	}
}