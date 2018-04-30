package pack99;

abstract class GF {
	abstract public void house();
}

class Father extends GF {
	public void house() {
		System.out.println("House is completed");
	}
}

public class NewText {
	public static void main(String[] args) {
		Father f1 = new Father();
		f1.house();
	}

}
