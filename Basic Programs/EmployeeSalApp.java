//WAP Input basic salary of Employee and calculate total salary using following terms
//da=30%
//hra=30%
//total= bs+da+hra
import java.util.*;
public class EmployeeSalApp
{
    public static void main(String x[])
	{
	   int da,hra,total,bsal;
	   Scanner xyz = new Scanner(System.in);
	   System.out.println("Enter a basic salary \n");
	   bsal = xyz.nextInt();
	   da = bsal * 30/100;
	   hra = bsal * 30/100;
	   total = bsal+hra+da;
	   System.out.printf("Total salary is %d",total);
	}
}
