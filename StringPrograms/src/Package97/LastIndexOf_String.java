package Package97;

public class LastIndexOf_String {

	public static void main(String[] args) {
		String s= "koi na koi chahiye pyar karne wala";
		
		// Search the char index no from the last
		System.out.println(s.lastIndexOf('a'));
		
		//Search the String index no from the last
		System.out.println(s.lastIndexOf("karne"));
		
		//Search char from 5 index no of the string
		System.out.println(s.lastIndexOf('k', 5));
		
		//
		System.out.println(s.lastIndexOf("koi", 10));

   }
}