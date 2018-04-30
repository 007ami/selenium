package Test;
// Inheritance with the same requirements in Supar class
class Shape
{
	public void rotate()
	{
		System.out.println("Rotate in clockwise direction");
	
	}
}

class Rectangle extends Shape
{
	int l=10;
	int b=14;
	String color= "Blue";
	public void area()
	{
		System.out.println("Area of Rectangle is = "  + l*b);
	}
}

class Triangle extends Shape
{
	int b=7;
	int h=12;
	public void area()
	{
		System.out.println("Area of triangle is " + 0.5*(b*h));
	}
}

public class angle {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.rotate();
		System.out.println(r1.color);
		r1.area();
		
		Triangle t1=new Triangle();
		t1.rotate();
		t1.area();

	}

}
