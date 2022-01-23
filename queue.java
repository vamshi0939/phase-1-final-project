package assisted;
import java.util.*;
public class queue 
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
        		locationsQueue.add("hyderabad");
        		locationsQueue.add("goa");
        		locationsQueue.add("newyork");
        		locationsQueue.add("london");
        		locationsQueue.add("sweden");
        		locationsQueue.add("mumbai");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}


