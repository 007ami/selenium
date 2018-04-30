package package98;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class ProgOfHashMap {

	public static void main(String[] args) {
      HashMap hm = new HashMap();
      hm.put(2, "Java");
      hm.put(5, "Mava");
      hm.put('a', "Manual");
      hm.put("CD", "Sql");
      hm.put(2.5, 'K');
      hm.put('M', 6);
      
      System.out.println(hm.get("CD"));
      
      Set s1=hm.entrySet();
      // By iterator
      Iterator it= s1.iterator();
      while(it.hasNext()){
    	  System.out.println(it.next());
      }
// Execute by foreach loop
      for (Object object : s1) {
    	  System.out.println(object);
		
	}
	}

}
