/*
How to initialize two dimensional arrays in JAVA
Syntax : 
datatype variablename [][] = new Datatype[][]
*/
import java.util.*;
public class ValueInitializeToArray
{  public static void main(String x[])
   {  int a[][]=new int[][]
		{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
	 System.out.println("Display array values");
	  for(int i=0;i<a.length;i++)
	 {
	    for(int j=0;j<a[i].length;j++)
		{
	      System.out.printf("%d\t",a[i][j]);
		}
		 System.out.printf("\n");
	 }
   }
}
