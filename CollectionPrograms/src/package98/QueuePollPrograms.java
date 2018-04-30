package package98;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePollPrograms {

	public static void main(String[] args) {
		Queue q1= new LinkedList();
        q1.add(10);
        q1.add('A');
        q1.add("Fruity");
        q1.add("Amit");
        q1.add(20);
        System.out.println(q1);
        System.out.println(q1.size());
        System.out.println(q1.poll());
        System.out.println(q1.size());
        System.out.println(q1.poll());
        System.out.println(q1.size());
        System.out.println(q1.poll());
        System.out.println(q1.size());
        System.out.println(q1.poll());
        System.out.println(q1.size());
        System.out.println(q1.poll());
        System.out.println(q1.size());
        
        System.out.println(q1);
	}

}
