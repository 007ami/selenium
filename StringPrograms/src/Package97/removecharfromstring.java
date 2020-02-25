package Package97;

public class removecharfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str= "This is amit";
       System.out.println(removeCharAt(str,11));
	}

	private static String removeCharAt(String s, int pos) {
		// TODO Auto-generated method stub
		return s.substring(0,pos) + s.substring(pos+1);
	}

}
