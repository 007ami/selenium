package method;
// Method Overloading define same method
public class Case1 {
public void search(String name)
{
	System.out.println("Search with the Name");
}
public void search(int mobile,String Location)
{
	System.out.println("String Location");
}

	public static void main(String[] args) {
		Case1 s1=new Case1();
		s1.search("Jaipur");
		s1.search(3286, "Rajasthan");
		

	}

}
