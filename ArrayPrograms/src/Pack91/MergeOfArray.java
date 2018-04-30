package Pack91;

public class MergeOfArray {

	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 7 };
		int b[] = { 1, 2, 3 };
		int c[] = new int[a.length + b.length];
		int x = 0;
		for (int k : a) {
			c[x++] = k;
		}
		for (int j : b) {
			c[x++] = j;
		}
		for(int m:c){
			System.out.println(m);
		}
	}

}
