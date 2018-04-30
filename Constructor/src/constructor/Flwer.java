package constructor;
// Perametrised constructor
public class Flwer {
String fName;
public Flwer(String name)
{
	fName=name;
	System.out.println(fName);
}
	public static void main(String[] args) {
		Flwer f1=new Flwer("Rose");
		Flwer f2=new Flwer("Lilly");
	}

}
