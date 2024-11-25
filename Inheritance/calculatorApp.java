class Value
{ int a,b;
   void setValue(int x,int y)
   {  a=x;
      b=y;
   }
}
class Add extends Value
{
    int getAdd(){
      return a+b;
    }
}
class Mul extends Value
{   int getMul()
    {  return a*b;
    }
}
public class CalculatorApp
{
    public static void main(String x[])
    { Add ad = new Add();
	ad.setValue(10,20);
    int result=ad.getAdd();
      System.out.println("Addition is "+result);
       Mul m = new Mul();
	m.setValue(10,20);
    result=m.getMul();
	System.out.println("Multiplication is "+result);

    }
}
