package Overridding;
class Shape{
public void rotate()
{
	System.out.println("Rotate in clockwise direction");
}
}
class Rectangle extends Shape
{
	public void rotate()
	{
		System.out.println("Rotate in anti clockwise direction");
	}
}
class Triangle extends Shape
{
	
}
class Square extends Shape
{
	
}

public class Test {

	public static void main(String[] args) {
     
	Rectangle r1=new Rectangle();
    r1.rotate();
    Triangle t1=new Triangle();
    t1.rotate();
    Square s1=new Square();
    s1.rotate();
	}

}
