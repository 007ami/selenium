package Pack91;

public class BiggestElement {

	public static void main(String[] args) {
		int a[] = { 4, 15, 19, 8, 24, 6 };
		int big = a[0];
		for (int k : a) {
			if (k > big)
				big = k;
		}
		System.out.println(big);
	}

}
