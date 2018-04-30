package package98;

import java.util.HashSet;
import java.util.Iterator;

public class ProForHashSet {

	public static void main(String[] args) {
		HashSet h1= new HashSet();
		h1.add("Amit");
		h1.add(20);
		h1.add(20.5);
		h1.add('P');
		h1.add('K');
		h1.add("Amit");
	//This is for execute by For each loop 	
		/*for(Object obj:h1){
			System.out.println(obj);
		}*/

   // Execute by iterator
		
		Iterator it= h1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		
		}

	}

}
