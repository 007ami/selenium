package Overridding;
abstract class Memo{
static int i=10;
public static void run()
{
	System.out.println("in run");
}
public static void wish()
{
	System.out.println("in wish");
}
}
public class Demo4 {
	public static void main(String[] args) {
		System.out.println(Memo.i);
		Memo.run();
		Memo.wish();

	}

}

/*class Baddeveloper
{
	public static void main(String[] args){
		Memo d1=new Memo();
		d1.run();
		d1.wish();
		System.out.println(d1.i);
	}
}*/