package Package97;

public class SimpleString {

	public static void main(String[] args) {
		String s1= new String("Java");
		String s2= new String("Java");
		String s3= "Testing";
		String s4= "Testing";
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		//String s5= "java";
	}

}
