package assignment;
import java.util.*;
public class map {

	public static void main(String[] args) {
		
	
				// map
				
				//Hashmap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"Tim");    
			      hm.put(2,"Mary");    
			      hm.put(3,"Catie");   
			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			     //HashTable
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"mahesh");  
			      ht.put(5,"suresh");  
			      ht.put(6,"raju");  
			      ht.put(7,"arjun");  

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			
			      //TreeMap
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"surya");    
			      map.put(9,"teja");    
			      map.put(10,"kalyan");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    
			      
		
	}

}
