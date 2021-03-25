package wiley;

//Client comes with no functionalities for the meths first

abstract class Ayush5 {
	abstract void add();

	abstract void div();

	abstract void mult();
}

//Client comes with functionalities of only addition and division 
// Convert class to abstract

abstract class Hello extends Ayush {
	void add() {
		System.out.println("Addition");
	}

	void div() {
		System.out.println("Division");
	}
}

//Here, client comes with functionality of mult too

public class Abstraction4 extends Hello {

	void mult() {
		System.out.println("Multiplication");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction4 ab4 = new Abstraction4();
		ab4.add();
		ab4.mult();
		ab4.div();

	}

}
