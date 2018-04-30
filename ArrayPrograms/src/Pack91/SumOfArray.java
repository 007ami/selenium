package Pack91;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]={4,5,6,7,8,9,10};
		int sum=0;
		for (int i = 0; i < a.length-1; i++) {
			sum+=a[i];
		}
System.out.println(sum);
	}

}
