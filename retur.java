package assignment;
public class retur {
		  int m1()
		  { 
		   System.out.println("m1 method") ;
		      return 48; 
		} 
		  float m2() 
		  { 
		    System.out.println("m2 method"); 
		      return 88.1f; 
		  } 
		  static char m3()
		  { 
		    System.out.println("m3 method"); 
		     return 'd'; 
		  } 
		double m4() 
		{
		System.out.println("m4 method"); 
		return 74.1d;
		}
		static String m5() 
		{
		  System.out.println("m5 method"); 
		    return "m5 method";
		}
		long m6() 
		{
		 System.out.println("m6 method"); 
		 return 466131317;
		}
		public static void main(String[] args)
		 { 
		// Create an object of the class named Sample. 
				retur r = new retur();
		// Call m1() method using reference variable s. Since s.m1() is returning an integer value, we will store value by using a variable x with a data type int. 
		      int x = r.m1(); 
		// Now print the return value. 
		    System.out.println("Return value of m1()= " +x); 
		    float y = r.m2();
		    System.out.println("Return value of m2()= " +y); 
		// Call static method using the class name. Since m3() method returns character, we will store a character using a variable ch with type char. 
		 char ch = r.m3(); 
	    System.out.println("Return value of m3()= " +ch); 
		double d = r.m4() ;
		System.out.println("Return value of m4()= " +d); 
		String str = r.m5() ;
		System.out.println("Return value of m5()= " +str); 
		long l = r.m6() ;
		System.out.println("Return value of m6()= " +l); 
		  } 
		 }
		

	


