package Overridding;
abstract class A{
	abstract public void run();
	public void wish()
	{
		System.out.println("In wish");
	}
}
class B extends A{
	public void run()
	{
		System.out.println("in Run");
	}
}
public class Demo1 {
	public static void main(String[] args) {
    //A a1=new A();
	B b1=new B();
	b1.run();
	b1.wish();
	}

}
