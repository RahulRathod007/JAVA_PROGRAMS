class TestLocal
{
	int m;
	void setval(int m)
	{
		this.m=m;
	}
	void showsquare()
	{
		System.out.printf("\n Square is %d \n",m*m);
	}
}
public class Demo
{
	public static void main(String[] args) 
	{
		TestLocal t1 =  new TestLocal();
		t1.setval(5);
		t1.showsquare();
		
		TestLocal t2 = new TestLocal();
		t2.setval(10);
		t2.showsquare();
    }

} 



 