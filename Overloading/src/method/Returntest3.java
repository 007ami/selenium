package method;
// method with return type and arguments
public class Returntest3 {
	public static int mul(int i, int j)
	{
		
		int k=i*j;
		return k;
	}
	
	public static void main(String[] args) {
		System.out.println(mul(6,6));
		int a= mul(5,3);
		System.out.println(a);

	}

}
