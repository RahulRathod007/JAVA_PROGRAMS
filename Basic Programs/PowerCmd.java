//WAP to Input two values from keyboard consider first value as base and second as //index and calculate its power.
public class PowerCmd
{
    public static void main(String x[])
	{
	 int base,index,p=1;
	 base = Integer.parseInt(x[0]);
	 index= Integer.parseInt(x[1]);
	 for(int i=1;i<=index;i++)
	 {
		p = p * base; 	
	 }
	 System.out.printf("power is %d",p);
	}
}