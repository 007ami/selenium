public class Login {
public static void main(String[] args) {
	String s = "I live in Bangalore";
	String [] split = s.split(" ");
	String res = "";
	for(int i=split.length-1;i>=0;i--){
		res= res+(split[i]+ " ");
	}
	System.out.println(res);
 }
}
