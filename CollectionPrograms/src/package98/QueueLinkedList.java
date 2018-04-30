package package98;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
	Queue q3= new LinkedList();
	q3.add(10);
	q3.add('A');
	q3.add("Amit");
	while (q3.peek()!=null) {
		
		System.out.println(q3.poll());
	}

	}

}
