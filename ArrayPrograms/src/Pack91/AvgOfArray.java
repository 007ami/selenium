package Pack91;

public class AvgOfArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 7, 9 };
		int sum = 0;
		for (int k : a) {
			sum = sum + k;
		}
		int avg = sum / a.length;
		System.out.println(avg);
	}

}
