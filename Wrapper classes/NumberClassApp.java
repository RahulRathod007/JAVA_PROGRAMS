// Methods of Number Class --> used for Convert numeric reference to primitive value .
//Example: we want to convert float to int, double to int, long to int using following methods.
public class NumberClassApp
{
	public static void main(String x[])
	{
		 
		//Numeric Reference to Primitive Integer value.
		Float a = 5.4f;
		Double b = 5.4;
		Long c = 54L;
		
		int p = a.intValue(); //  convert float to integer
		int q = b.intValue(); //  convert double to integer
		int r = c.intValue(); //  convert long to integer
		
		System.out.printf("P = %d \n",p);
		System.out.printf("Q = %d \n",q);
		System.out.printf("R = %d \n",r);
		
		
		//Numeric Reference to Primitive Long value.
		/*
		Float a = 5.4f;
		Double b = 5.4;
		Integer c = 54;
		
		long p = a.longValue(); //  convert float to long
		long q = b.longValue(); //  convert double to long
		long r = c.longValue(); //  convert long to long
		
		System.out.printf("P = %d \n",p);
		System.out.printf("Q = %d \n",q);
		System.out.printf("R = %d \n",r);
		*/
		
		/*
		//Numeric reference to primitive float value.
		Integer a = 10;
		Double b  = 20.0;
		Long  c = 300L;
		
		float  p= a.floatValue();  //convert integer to float.
		float  q= b.floatValue(); //convert double to float. 
		float  r= c.floatValue(); //convert long to float.
		
		System.out.printf("P = %f \n",p);
		System.out.printf("Q = %f \n",q);
		System.out.printf("R = %f \n",r);
		*/
		
		/*
		//numeric reference to primitive double value.
		Integer a = 10;
		Long b = 200L;
		Float  c = 30.5f;
		
		double p = a.doubleValue(); // convert integer to double.
		double q = b.doubleValue(); // convert long to double.
		double r = c.doubleValue(); // convert float to double.
		
		System.out.printf("P = %f \n",p);
		System.out.printf("Q = %f \n",q);
		System.out.printf("R = %f \n",r);
		*/
		
		/*
		//numeric reference to primitive byte value.
		Integer a = 100;
		Long b = 200L;
		Float  c = 300.5f;
		
		byte p = a.byteValue(); // convert integer to byte.
		byte q = b.byteValue(); // convert long to byte.
		byte r = c.byteValue(); // convert float to byte.
		
		System.out.printf("P = %d \n",p);
		System.out.printf("Q = %d \n",q);
		System.out.printf("R = %d \n",r);
		*/
		
		/*
		//numeric reference to primitive short value.
		Integer a = 100;
		Long b = 200L;
		Float  c = 300.5f;
		
		short p = a.shortValue(); // convert integer to short.
		short q = b.shortValue(); // convert long to short.
		short r = c.shortValue(); // convert float to short.
		
		System.out.printf("P = %d \n",p);
		System.out.printf("Q = %d \n",q);
		System.out.printf("R = %d \n",r);
		*/
	}
}