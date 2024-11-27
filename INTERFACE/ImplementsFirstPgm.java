/*If we want to write logics of interface method we need to implement interface in any another class and override its method and write logic and if we want to implement interface in another class we have to use implements keyword and must be use public keyword when we override interface method.*/

interface T
{
	float pi = 3.14f; // public static final pi -- internally;
	void show(); // public abstact void show() -- internally;
}

public class ImplementsFirstPgm
{
	public static void main(String x[])
	{
		System.out.println("Pi is "+T.pi); // can call method using inerface name.variablename 
	}
}

/*
interface T
{
	float pi = 3.14f; // public static final pi -- internally;
	void show(); // public abstact void show() -- internally;
}
class TA implements T
{
	public void show()
	{
		System.out.println("I am Show method of TA class");
	}
}
public class ImplementsFirstPgm
{
	public static void main(String x[])
	{
		TA t = new TA();
		t.show();
	}
}

*/

