package Package97;

public class Add2String {

	public static void main(String[] args) {
		String a= "12345";
		String b= "67890";
		
		a= b+a;
		
		System.out.println(a);
		b= a.substring(5);
		System.out.println(b);
		a= a.substring(0, 5);
		System.out.println(a);
	}

}
