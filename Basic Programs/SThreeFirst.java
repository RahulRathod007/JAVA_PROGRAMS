import java.util.*;
class Player
{
	 int jerno;
	 String name;
	 int run;
	 int match;
	
	public void setJerno(int jerno)
	{
		this.jerno=jerno;
	}
	public int getJerno()
	{
		return jerno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setRun(int run)
	{
		this.run=run;
	}
	public int getRun()
	{
		return run;
	}
	public void setMatch(int match)
	{
		this.match=match;
	}
	public int getMatch()
	{
		return match;
	}
}

public class SThreeFirst //main class 
{
	public static void main(String x[]) //main function;
	{
		Player p[] = new Player[5]; //plare object array;
		System.out.println("Enter player data : ");
		System.out.println("Name : ");
		System.out.println("Jerno : ");
		System.out.println("Run : ");
		System.out.println("Match : ");
		for(int i=0;i<p.length;i++)
		{	p[i] = new Player(); // array of object
			Scanner sc = new Scanner(System.in); //scanner class for take input from user;
			System.out.println("Enter Player Detail");
			int jerno;
			String name;
			int run;
			int match;
			name = sc.nextLine();
			jerno = sc.nextInt();
			run = sc.nextInt();
			match = sc.nextInt();
			p[i] = new Player(); //set the values;
			p[i].setJerno(jerno); //set the values;
			p[i].setName(name); //set the values;
			p[i].setRun(run); //set the values;
			p[i].setMatch(match); //set the values;
		}
		//display;
		System.out.println("Display Player");
		System.out.println("jrno\t run\t matches\t name\t");
		for(int i=0;i<p.length;i++)
		{ 
			System.out.println(p[i].getJerno()+"\t"+p[i].getRun()+"\t"+p[i].getMatch()+"\t"+p[i].getName()+"\t"); //print vlues;
		}
		System.out.println("Enter position: ");
		int pos;
		Scanner xyz = new Scanner(System.in); //scanner class for take input from user;
		pos = xyz.nextInt(); //position;
		for(int i=pos;i<p.length-1;i++)
		{
			Player temp = p[i];
			p[i] = p[i+1];
			p[i+1] = temp;
		}
		System.out.println("Final Output");
		for(int i=0;i<p.length-1;i++) //print values;
		{
			System.out.println(p[i].getJerno()+"\t"+p[i].getRun()+"\t"+p[i].getMatch()+"\t"+p[i].getName()+"\t");
		}
	}
}