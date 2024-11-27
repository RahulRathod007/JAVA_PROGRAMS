//Syntax :  Outerclassname oref = new Outerclassname();
//Outerclassname.innerclassname iref=oref.new innerclassname();
//Syntax 2 : ABC.MNO m = new ABC().new MNO();
class ABC
{   void display()
   { System.out.println("I am Member of ABC");
}
  class MNO
  {  void show()
     { System.out.println("I am member of MNO");
   }
  }
}
public class SimpleNestedApp
{  public static void main(String x[])
   { ABC a = new ABC();
	a.display();
	ABC.MNO m=a.new MNO();
	m.show();
   }
}
