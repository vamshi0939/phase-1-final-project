package assignment;

import java.util.*;

public class collectionstypes 
{
			public static void main(String[] args)
			{
				// arraylist
				System.out.println("ArrayList");
				ArrayList<String> city=new ArrayList<String>();   
			      city.add("hyderabad");//
			      city.add("pune");    	   
			      System.out.println(city);  
				
				//creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector();
			      vec.addElement(31); 
			      vec.addElement(88); 
			      System.out.println(vec);
				
				//linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("mahesh");  
			      names.add("tom");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(155);  
			       set.add(845);  
			       set.add(333);
			       set.add(582);
			       System.out.println(set);
			       
			       // linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(121);  
			       set2.add(513);  
			       set2.add(142);
			       set2.add(814);	       
			       System.out.println(set2);
			      	} 
			      }  
		

}
