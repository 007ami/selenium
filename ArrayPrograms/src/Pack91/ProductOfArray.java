package Pack91;

public class ProductOfArray {

	public static void main(String[] args) {
		int a[]={7,8,9,6,5,4};
		int prod=1;
		for (int i = 0; i < a.length-1; i++) {
			prod= prod*a[i];
			
		}
System.out.println(prod);
	}

}
