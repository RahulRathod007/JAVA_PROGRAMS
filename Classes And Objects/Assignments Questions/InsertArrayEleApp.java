//.WAP to create the class name as InsertArrayEle with a following methods
import java.util.*;
class InsertArrayEle
{
	int ch[];
	int index;
	int value;
	void setIntArray(int ch[] , int index, int value)
	{	
		this.ch = ch;
		this.index=index;
		this.value=value;
	}
	void insertValueOnIndex()
	{
		System.out.println("\n Display Original Arryay \n");
		for(int i=0;i<ch.length;i++)
		{
			System.out.printf("%d\t",ch[i]);
		}
		
		System.out.println("\n After Shifting index \n");
		for(int i=ch.length-2;i>=index;i--)
		{
			ch[i+1]=ch[i];
		}
		ch[index]=value;
		for(int i=0;i<ch.length;i++)
		{
			System.out.printf("%d\t",ch[i]);
		}
	}
}
public class InsertArrayEleApp
{
	public static void main(String x[])
	{
		 Scanner xyz = new Scanner(System.in);
		 int ch[] = new int[6];
		 System.out.println("\n Enter Array values \n");
		 for(int i=0;i<ch.length-1;i++)
		 {
			 ch[i] = xyz.nextInt();
		 }
		 System.out.println("\n Enter a index \n");
		 int index = xyz.nextInt();
		 System.out.println("\n Enter a value \n");
		 int value = xyz.nextInt();
		 InsertArrayEle a1 = new InsertArrayEle();
		 a1.setIntArray(ch,index,value);
		 a1.insertValueOnIndex();
	}
}