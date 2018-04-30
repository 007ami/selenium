package Overridding;
abstract class GF
{
	abstract public void house();
}
class pitaji extends GF
{
	public void house()
	{
		System.out.println("House is completed");
	}
}
public class Demo2 {
	public static void main(String[] args) {
		pitaji p3=new pitaji();
		p3.house();

	}

}
