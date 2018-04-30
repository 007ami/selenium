package Test;
// inheritance with same supar classbut different arguments.
class Mobile
{
	public void OS()
	{
		System.out.println("OS versions are android");
	}
}
class Samsung extends Mobile
{
	String color= "Metal Black";
	String Ram= "4 gb";
	int price= 8000;
	public void version()
	{
	System.out.println("Samsung - Android version is 7.0.0");
}
}
class Nokia extends Mobile
{
	String color= "Silver";
	String Ram= "3 gb";
	int price= 15000;
	public void version()
	{
	System.out.println("Nokia- Android version is 7.0.1");
}
}
class mi extends Mobile
{
	String color= "Gold";
	String Ram= "3 gb";
	int price= 5000;
	public void version()
	{
	System.out.println("mi- Android version is 7.0.2");	
}
}
public class Cellphone {
	public static void main(String[] args) {
    Samsung s1=new Samsung();
    s1.OS();
    System.out.println(s1.color);	
    System.out.println(s1.Ram);
    System.out.println(s1.price);
    s1.version();
    
    Nokia n1=new Nokia();
    n1.OS();
    System.out.println(n1.color);	
    System.out.println(n1.Ram);
    System.out.println(n1.price);
    n1.version();
    
    mi m1=new mi();
    m1.OS();
    System.out.println(m1.color);	
    System.out.println(m1.Ram);
    System.out.println(m1.price);
    m1.version();
    
    
	}

}
