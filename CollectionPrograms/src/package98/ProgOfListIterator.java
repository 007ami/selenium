package package98;

import java.util.ListIterator;
import java.util.Vector;

public class ProgOfListIterator {

	public static void main(String[] args) {
		Vector v1= new Vector();
		v1.add(10);
		v1.add('S');
		v1.add("Amit");
		v1.add('K');
		v1.add(20.6);
		v1.add("Vijay");
		v1.add(10);
		
		ListIterator lt= v1.listIterator();
		
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}

	}

}
