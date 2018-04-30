package Pack91;

public class SmallElement {

	public static void main(String[] args) {
		int a[] = { 4, 15, 19, 8, 24, 6 };
		int small = a[0];
		for (int k : a) {
			if (k < small)
				small = k;
		}
		System.out.println(small);

	}

}
