package Package97;

public class RemoveTheSpaceFromString {

	public static void main(String[] args) {
		String s1 = "   My   Name   is   Khan   ";
		String res = "";
		for (int i = 0; i<=s1.length()-1; i++) {
			char ch = s1.charAt(i);
			if (ch != ' ') {
				res += ch;
			}

		}
		System.out.println(res);
	}

}
