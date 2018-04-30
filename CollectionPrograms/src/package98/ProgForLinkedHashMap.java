package package98;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class ProgForLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap h1 = new LinkedHashMap();
		h1.put(0, "Vikas");
		h1.put(1, "Vikram");
		h1.put(5, "VIjay");
		h1.put(6, 5.6);
		h1.put("Vijay", 2);
		h1.put('A', "Ram");
		h1.put(2.2, 'A');
		h1.put(2, 12.2);
		
		Set s1= h1.entrySet();
		Iterator it= s1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
