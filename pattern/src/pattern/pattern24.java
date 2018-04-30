package pattern;

public class pattern24 {
	public static void main(String[] args) {
		int space=3;
	      int star=1;
	      int n=7;
	      for(int i=1;i<=7;i++)
	      {
	    	  for(int j=1;j<=space;j++)
	    	  {
	    		  System.out.print(' ');
	    	  }
	    	  for(int k=1;k<=star;k++)
	    	  {
	    		  System.out.print('*');
	    	  }
	    	  System.out.println();
	    	  if(i<=n/2)
	    	  {
	    		  space--;
		    	  star+=2;  
	    	  }
	    	  else
	    	  {
	    		  space++;
	    		  star-=2;
	    	  }
	    	    
	      }

	}

}
