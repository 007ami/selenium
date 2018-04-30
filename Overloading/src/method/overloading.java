package method;
// method overloading
public class overloading {
	
	public void run()
	{
		System.out.println("In default run");
	}
	
	public void run(int i)
	{
		System.out.println("In int run");
	}
	public static void main(String[] args) {
	
	overloading o1=new overloading();
	o1.run();
	o1.run(8);
	
	}
}