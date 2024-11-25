/* Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed. For example, while creating object if we pass "Java", then "I love Java" should be printed. */

class programming
{
	programming()
	{
		System.out.println(" I love programming languages ");
	}
	programming(String name)
	{
		System.out.println(" I Love"+name);
	}
	
}
public class ProgrammingLanguages
{
	public static void main(String x[])
	{
		programming p = new programming();
		programming p1 = new programming(" Java");
	}
}