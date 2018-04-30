package Overridding;
// Inherit the Abstract class
abstract class GF1
{
	abstract public void house1();
	abstract public void house2();
}
abstract class babuji extends GF1
{
	public void house1()
	{
		System.out.println("house 1 is completed");
	}
}
	class Putra extends babuji  // Implementation class or Compainion class or Supporting class 
	{	
	public void house2()
	{
	 System.out.println("house 2 is completed");	
	}
}
public class Demo3 {
	public static void main(String[] args) {
		Putra p1=new Putra();
	    p1.house1();
		p1.house2();

	}

}
