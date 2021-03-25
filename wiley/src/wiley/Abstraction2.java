package wiley;

abstract class Ayush3 {
	void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	abstract void div(int c, int d);
}

public class Abstraction2 extends Ayush3 {

	void div(int c, int d) {
		System.out.println("Division: " + (c / d));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction2 ab2 = new Abstraction2();
		ab2.add(3, 3);
		ab2.div(20, 5);
	}

}
