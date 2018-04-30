// constructor
public class firstjava {
	int l;
	int b;
	String color;
	public firstjava(int l,int b, String color)
	{
		this.l=l;
		this.b=b;
		this.color=color;
		
	}
	public firstjava(int l, int b)
	{
		this.l=l;
		this.b=b;
		
	}
	public void display()
	{
		System.out.println(l);
		System.out.println(b);
	if(color!=null)
	{
		System.out.println(color);
		
	}
	}
	public static void main(String[] args){
		firstjava f1=new firstjava(4,8,"Red");
		firstjava f2=new firstjava(8,8);
	 f1.display();
	 f2.display();
	}
	}


