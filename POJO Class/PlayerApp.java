/*create a pojo class name as Player with field id,name,run and store data in pojo objec and display it.
*/
class Player
{
	private int id;
	private String name;
	private int run;
	
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setrun(int run)
	{
		this.run=run;
	}
	public int getrun()
	{
		return run;
	}
}
public class PlayerApp
{
	public static void main(String x[])
	{
		Player p = new Player();
		p.setid(1);
		p.setname("Rahul");
		p.setrun(97);
		int playerid = p.getid();
		String playername= p.getname();
		int playerrun=p.getrun();
		
		System.out.print("\nId:"+playerid);
		System.out.print("\nName:"+playername);
		System.out.print("\nRun:"+playerrun);
		}
}