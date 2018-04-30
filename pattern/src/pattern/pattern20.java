package pattern;

public class pattern20 {

	public static void main(String[] args) {
      for(int i=1;i<=3;i++)
      {
    	  for(int j=1;j<=5;j++)
    		  {
    		     if(i+j==4|j==i)
    		     {
    		    	 System.out.print('*');
    		     }
    		     else
    		     {
    		    	 System.out.print(' ');
    		     }
    		  }
    	  System.out.println();
      }

	}

}
