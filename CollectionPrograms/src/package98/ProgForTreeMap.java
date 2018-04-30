package package98;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class ProgForTreeMap {

	public static void main(String[] args) {
	TreeMap h1= new TreeMap();	
		
		h1.put(0, "Shiwani");
		h1.put(1, "Babu");
		h1.put(6, "Betu");
		h1.put(5, 'A');
		
		System.out.println(h1.get(6));
		
		Set s1= h1.entrySet();
		Iterator it= s1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
