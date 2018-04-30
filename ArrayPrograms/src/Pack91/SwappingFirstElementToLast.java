package Pack91;

public class SwappingFirstElementToLast {

	public static void main(String[] args) {
		int a[]={7,1,2,3,4,5,6};
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		for(int k:a){
			System.out.println(k);	
		}
	}

}
