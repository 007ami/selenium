package package98;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TreversingIterator {

	public static void main(String[] args) {
		PriorityQueue q1= new PriorityQueue();
		
		q1.add(10);
		q1.add(20);
		q1.add(5);
		
		Iterator i1= q1.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}

	}

}
