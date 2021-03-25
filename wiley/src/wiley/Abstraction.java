package wiley;

abstract class Ayush2 {

	abstract void add();
}

public class Abstraction extends Ayush2 {
	void add() {
		System.out.println("hello");
	}

	public static void main(String[] args) {

		Abstraction a = new Abstraction();
		a.add();

	}

}
