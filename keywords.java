package assisted;

public class keywords {
	
    
    void Division() throws ArithmeticException
    {
        int a=45,b=0,c;
           c= a / b;
        System.out.print("\n\tThe result is : " + c);
    }
     public static void main(String[] args)
    {
keywords T = new keywords();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }
}


