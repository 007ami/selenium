package package98;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		v1.add(1, 100); // Add element in the VectorList
		System.out.println(v1);
		v1.set(2, 200); // Replace the element from the index 2.
		
		System.out.println(v1);

	}

}
