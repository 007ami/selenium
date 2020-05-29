package testing;

public class reverseStringSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I live in Bangalore";
		String [] split = s.split(" ");
		String res = "";
		for(int i=split.length-1;i>=0;i--){
			res= res+(split[i]+ " ");
		}
		System.out.println(res);
	 }

}
