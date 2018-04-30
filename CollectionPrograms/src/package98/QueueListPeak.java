package package98;

import java.util.LinkedList;
import java.util.Queue;

public class QueueListPeak {

	public static void main(String[] args) {
    Queue q2= new LinkedList();
    q2.add("Amit");
    q2.add("Guddan");
    q2.add(10);
    System.out.println(q2);
    q2.add(20);
    System.out.println(q2);
    System.out.println(q2.peek());
    System.out.println(q2);
    System.out.println(q2.peek());

	}

}
