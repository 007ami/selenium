package match;
abstract class Shape
{
	abstract public void area();
}
class Rectangle extends Shape
{
   public void area() {
	System.out.println("Area of Rectangle");	
		
   }
	
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("Area of triangle");
	}
}
class Square extends Shape
{
	public void area()
	{
		System.out.println("Area of Square");
	}
}
public class Demo {
	public static void main(String[] args) {
		
Rectangle r1=new Rectangle();
r1.area();
Triangle t1=new Triangle();
t1.area();
Square s1=new Square();
s1.area();
	}

}
