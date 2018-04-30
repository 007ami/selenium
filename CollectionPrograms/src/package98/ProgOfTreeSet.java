package package98;

import java.util.Iterator;
import java.util.TreeSet;

public class ProgOfTreeSet {

	public static void main(String[] args) {
		TreeSet t1= new TreeSet();
        t1.add('A');
        t1.add('B');
        t1.add('C');
        t1.add('D');
        t1.add('E');
        t1.add('F');
        
        
        Iterator it = t1.iterator();
        
        while(it.hasNext()){
        	System.out.println(it.next());
        }

        
	}

}
