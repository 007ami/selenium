package Overridding;

class Common
{
public void ringtone()
{
	System.out.println("Nokia Tone");
}
}
class Friend1 extends Common
{
	
}
class Friend2 extends Common
{
	
}
class Friend3 extends Common
{
	public void ringtone()
	{
		System.out.println("Apple itune");
	}
}
class Friend4 extends Common
{
	
}
public class Demo {
	public static void main(String[] args) {
	Friend1 f1=new Friend1();
	f1.ringtone();
	Friend2 f2=new Friend2();
	f2.ringtone();
	Friend3 f3=new Friend3();
	f3.ringtone();
	Friend4 f4=new Friend4();
	f4.ringtone();
	}

}
