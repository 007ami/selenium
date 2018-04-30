package Test;
// hybrid inheritence
class A{
	int i=10;
}
class B extends A
{
	public void run()
	{
		System.out.println("In run");
	}
}
class C extends A
{
int j=20;
}
class D extends C
{
	public void wish()
	{
		System.out.println("In wish");
	}
}
class E extends D
{
int k=30;	
}
public class Test {
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.i);
		
		B b1=new B();
		System.out.println(b1.i);
		b1.run();
		
		C c1=new C();
		System.out.println(c1.i);
		System.out.println(c1.j);
		
		D d1=new D();
		System.out.println(d1.i);
		System.out.println(d1.j);
		d1.wish();
		
		E e1=new E();
		System.out.println(e1.i);
		System.out.println(e1.j);
		e1.wish();
		System.out.println(e1.k);
		
	}

}
