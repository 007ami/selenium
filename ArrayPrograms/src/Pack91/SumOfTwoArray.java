package Pack91;

public class SumOfTwoArray {

	public static void main(String[] args) {
		int a[]={4,5,6,7,8};
		int b[]={3,2,1,8,7};
		int c[]= new int[a.length];
		for (int i = 0; i < b.length; i++) {
			c[i]=a[i]+ b[i];
			
		}
		for ( int i : c) {
			System.out.println(i);
		}
	}

}
