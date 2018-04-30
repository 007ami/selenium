package package98;

import java.util.PriorityQueue;

public class PriorityQueuepro {
   public static void main(String[] args) {
	    PriorityQueue q1= new PriorityQueue();
	    q1.add(10);
	    q1.add(7);
	    q1.add(5);
	    
	    while(q1.peek()!=null){
	    	System.out.println(q1.poll());
	    }
	    
	}

}
