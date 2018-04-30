package abs;

abstract class Gf1 {
	abstract public void h1();

	abstract public void h2();
}

abstract class F1 extends Gf1 {
	public void h1() {
		System.out.println("House 1 is completed");
	}

}

class S1 extends F1 {
	public void h2() {
		System.out.println("House 2 is completed");
	}
}

class Test1 {
	public static void main(String[] args) {
		S1 s = new S1();
		s.h1();
		s.h2();

	}
}