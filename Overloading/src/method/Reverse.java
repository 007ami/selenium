package method;
// connect two class with Testcase2
public class Reverse {
	public static int run(int n)
	{
	int res=0;
	while(n!=0)
	{
		int r=n%10;
		res= res*10+r;
		n=n/10;
	}
	
	return res;
	
	}

}
