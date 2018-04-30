package Overridding;
class Father1{
	public void marriage()
	{
		System.out.println("Rekha");
	}

}
class Son extends Father1{
	public void marriage()
	{
		System.out.println("Shiwani");
	}
	
}

public class Father {
	public static void main(String[] args) {
	Son s1=new Son();
	s1.marriage();

	}

}
