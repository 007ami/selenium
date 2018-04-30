
public class Demo {
	public static void main(String [] args){
		int a=0;
	    int b=1;
	    int c,i,count=10;
	    
	    System.out.println(a+" "+b);
	  for(i=2;i<count;++i)
	  {
		  c=a+b;
		  System.out.println(c);
		  
		  a=b;
		  b=c;
		  
	  }
	}
}
