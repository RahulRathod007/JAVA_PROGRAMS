//Throw clause Voting Machine Example.
class VotingException extends ArithmeticException
{
	public String getErrorMessage()
	{
		return "You are not eligible for vote";
	}
}
class VotingMachine
{
	void verifyAge(int age)
	{
		if(age<18)
		{
			VotingException ve = new VotingException();
			throw ve;
		}
		else
		{
			System.out.println("You are eligible For vote");
		}
	}
}
public class VotingAppThrow
{
	public static void main(String x[])
	{
		try
		{
			VotingMachine vm = new VotingMachine();
			vm.verifyAge(16);
		}
		catch(VotingException ex)
		{
			System.out.println("Error is ---> "+ex.getErrorMessage());
		}
	}
}