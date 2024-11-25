/*WAP to create class name as SubArrSum with constructor and one method 
SubArrSum(int a[],int sumValue): this method can accept array as parameter and one single value as sum
void findSubArr(): this method can find the sum array whose sum is equal with sum value provide by user.
Example: 1    5   2   5   4   8
User provided value: 12 
Index of sub array 1 and 3   and you sub array is 5 2 5
*/

class SubArrSum
{
	int a[],sumValue = 0;
	SubArrSum(int a[] ,int sumValue)
	{
		this.a=a;
		this.sumValue=sumValue;
	}
	void findSubArr()
	{	int sum=0;
		for(int i=0;i<a.length;i++)
		{	sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==sumValue){
					System.out.println("from:"+i+" TO:"+j);
					for(int k=i;k<=j;k++){
					System.out.print(a[k]+" ");
				}
				System.out.println();
				}
			}
		}
	}
		
}
public class SubArrSumApp
{
	public static void main(String x[])
	{
		int a[] ={1,5,2,5,4,8};
		SubArrSum s = new SubArrSum(a,12);
		s.findSubArr();
	}
}