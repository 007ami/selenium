package Package97;

public class IndexOf_String {

	public static void main(String[] args) {
		// check out the current position of the character in the String
		String s= "Selenium Tester";
		System.out.println(s.indexOf('u'));
		
		// Search from the given position of the character
		String s2= "Tansen Hai Jha Tandurusti hai waha";
		System.out.println(s2.indexOf('T', 2));
		
		//check out the index of the given String
		System.out.println(s2.indexOf("Hai"));
		
		// Check out the index of given string and search from the given index no. 
		System.out.println(s.indexOf("Tester", 3));
		
		

	}

}
