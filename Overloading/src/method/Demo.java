package method;
// Method overloading
public class Demo {
public static void multiply()
{
	System.out.println("Multiplication for all the digits");
}
public static void multiply(int i, int j)
{
	System.out.println(i*j);
}
public static void multiply(double i, int j)
{
	System.out.println(i*j);
}
public static void multiply(int i, double j)
{
	System.out.println(i*j);
}
public static void multiply(double i, double j)
{
	System.out.println(i*j);
}
	public static void main(String[] args) {
		multiply(4,5);
		multiply(14.2,2);
		multiply(4,6);
		multiply(5,7.2);

	}

}
