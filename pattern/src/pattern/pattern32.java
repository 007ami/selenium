package pattern;

public class pattern32 {
	public static void main(String[] args) {
		int k=70;
		for(int i=1;i<=3;i++)
	     {
	    	 for(int j=3;j>=i;j--)
	    	 {
	    		 System.out.print(k-=10);
	    	 }
	    	 System.out.println();
	     }
	}

}
