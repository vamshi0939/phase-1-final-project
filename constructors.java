package assignment;

public class constructors {
		 int id;  
		    String name;  
		    // create a default constructor
		      constructors()
		      {
		      }
		    //create a parameterized constructor  
		    constructors(int i,String n)
		    {  
		    id = i;  
		    name = n;  
		  }  
		    public static void main(String args[])
		    {  
		    //create objects and passing values  
		    	constructors c1 = new constructors();  
		    constructors c2 = new constructors(9875,"maheshbabu"); 
		    System.out.println(c2.id);
		    System.out.println(c2.name);
	}
}
		      
