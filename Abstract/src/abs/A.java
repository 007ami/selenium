package abs;

abstract class B {
	abstract public void run();

	public void wish() {
		System.out.println("in Wish");
	}
}

class C extends B {
	public void run() {
		System.out.println("in run");
	}
}

class A {
	public static void main(String[] args) {
		C c1 = new C();
		c1.run();
		c1.wish();
	}
}