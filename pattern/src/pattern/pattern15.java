package pattern;

public class pattern15 {

	public static void main(String[] args) {
         char ch='A';
         int k=9;
         for(int i=1; i<=3; i++)
         {
        	 for(int j=1; j<=3; j++)
        	 {
        		 System.out.print(ch++);
        		 System.out.print(k--);
        	 }
        	 System.out.println();
         }
             
	}

}
