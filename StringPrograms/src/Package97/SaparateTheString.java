package Package97;

public class SaparateTheString {

	public static void main(String[] args) {
		String s1= "Sochenge ki tumhe !@#$%^&* #34738748 &*#& ( DKJFKDS) PYAR krenge ki nhi";
		String number="";
		String sysmbols = "";
		String Alphabates= "";
		
		for (int i=0; i<=s1.length()-1; i++) {
			char ch= s1.charAt(i);
			if(Character.isDigit(ch)){
				number+=ch;
			}
			else if(Character.isAlphabetic(ch)){
				Alphabates+=ch;	
			}
			else {
				sysmbols+=ch;
			}
		}
		System.out.println(number);
		System.out.println(Alphabates);
		System.out.println(sysmbols);
	}

}
