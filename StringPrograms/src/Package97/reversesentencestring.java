package Package97;

public class reversesentencestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "I love in india";
		String [] split=s.split("");
		String result = "";
		for(int i= split.length-1; i>=0; i--)
		{
			result+=(split[i]+"");
		}
		System.out.println(result.trim());

	}

}
