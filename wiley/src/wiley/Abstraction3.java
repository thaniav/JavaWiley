package wiley;

// When you're unsure of number of parameters, or functionalities of the methods
//add, div and mult

abstract class Ayush4 {
	abstract void add();

	abstract void div();

	abstract void mult();
}

public class Abstraction3 extends Ayush4 {

	void add() {
		System.out.println("Addition");
	}

	void div() {
		System.out.println("Division");
	}

	void mult() {
		System.out.println("Multiplication");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction3 ab3 = new Abstraction3();
		ab3.add();
		ab3.mult();
		ab3.div();
	}

}
