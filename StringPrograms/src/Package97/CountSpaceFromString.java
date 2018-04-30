package Package97;

public class CountSpaceFromString {

	public static void main(String[] args) {
		String s1= "   My   Name   is   Khan   ";
		int count=0;
		
		for (int i = 0; i <s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch==' '){
				count++;
			}
		}
        System.out.println(count);
	}

}
