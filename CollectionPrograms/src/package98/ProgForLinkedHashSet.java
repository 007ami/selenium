package package98;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ProgForLinkedHashSet {

	public static void main(String[] args) {
      LinkedHashSet lh= new LinkedHashSet();
      lh.add(10);
      lh.add(5);
      lh.add("Amit");
      lh.add('A');
      lh.add("Sunil");
      lh.add('P');
      lh.add(15.5);
     
      //By for loop
      for (Object obj : lh) {
		System.out.println(obj);
	}
      // By iterator
      Iterator it = lh.iterator();
      while(it.hasNext()){
    	  System.out.println(it.next());
      }

	}

}
