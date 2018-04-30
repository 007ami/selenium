package Pack91;

public class ReversingTheArrayAndStoreVariable {

	public static void main(String[] args) {
		int a[]={9,8,7,6,5,4,3,2,1};
		int b[]=new int[a.length];
		int k=0;
		for(int i=a.length-1; i>=0;i--){
			b[k++]=a[i];
		}
		for(int h:b)
		{
			System.out.println(h);
		}
	}

}
