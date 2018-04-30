package package98;

import java.util.ArrayList;

public class ListInterface {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Fruity");
		a1.add(15);
		a1.add('c');
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i)); //Dedicated get method  for retrieve of data.
		}
		System.out.println(a1.isEmpty()); // TO check the ArrayList is Empty or Not.
		
		System.out.println(a1.contains("Fruity")); // To Check ArrayList Contains Fruity Value
		
		System.out.println(a1); // To print all the Element of the ArrayList
		
		a1.remove(null); // It allows the null Value
		a1.remove(1); // It is removed the 1 index no.of value
		System.out.println(a1); // Print ArrayList after the remove value
        
		a1.ensureCapacity(50); // To increase the Capacity of ArrayList
        
		a1.trimToSize(); // To trim the size of the ArrayList
        
		a1.clear();// Clear All the elements from the ArrayList
        
		System.out.println(a1); // Print after clear all the ArrayList
	}

}
