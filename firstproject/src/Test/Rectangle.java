package Test;
// Method overloading with change arguments
public class Rectangle {

	int l;
	int b;
	double a;
	int c;
	String color;
	public Rectangle(int l,int b, String color)
	{
		this.l=l;
		this.b=b;
		this.color=color;	
	}
	public Rectangle(int l, int b)
	{
		this.l=l;
		this.b=b;
	}
	public Rectangle(double a, int c)
	{
		this.a=a;
		this.c=c;
	}
	
	public void display()
	{
		System.out.println(l);
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
	if(color!=null)
	{
		System.out.println(color);
		
	}
	}
	public static void main(String[] args){
		Rectangle r1=new Rectangle(4,8,"Red");
		Rectangle r2=new Rectangle(5,8);
		Rectangle r3=new Rectangle(5.5,8);
		r1.display();
		r2.display();
		r3.display();
	}
	}