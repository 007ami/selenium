package package98;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList l1 = new java.util.LinkedList();
		l1.add(12);
		l1.add(23);
		l1.add(14);
		l1.add("Amit");
		l1.add('C');

		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println(l1.contains("Fruity"));
		System.out.println(l1);
        l1.remove(3);
        System.out.println(l1);
        
        l1.add(1, 100);
        System.out.println(l1);
        
        l1.add(2, 200);
        System.out.println(l1);
        
        l1.set(0, 300);
        System.out.println(l1);
        
        l1.set(3, 28);
        System.out.println(l1);
	}

}