
package assignment;
import java.util.*;
public class calci 
{
			public static void main(String []args){
				int a,b,choice;
				float result=0;
			  Scanner sc=new Scanner(System.in); 
				System.out.println("Enter first number: ");
				a=sc.nextInt();
				System.out.println("Enter second number: ");
				b=sc.nextInt();
				System.out.println("1: Addition");
				System.out.println("2 :Subtraction");
				System.out.println("3: Multiplication");
				System.out.println("4: Divide");
				System.out.println("5 :Remainder");
				System.out.println("Enter your choice: ");
				choice=sc.nextInt();
			switch(choice)
				{
					case 1:
						result=(a+b); break;
					case 2:
						result=(a-b); break;
					case 3:
						result=(a*b); break;
					case 4:
						result=(float)((float)a/(float)b); break;
					case 5:
						result=(a%b);
						break;
					default:
						System.out.println("invalid");
				}
				if(choice>=1 && choice<=5)
					System.out.println("=: " + result);
			}}


