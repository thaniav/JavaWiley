package wiley;

interface Abc2 {
	void add();

	void div();

}

interface Abcd2 {
	void mul();

	void sub();
}

class Abcde2{
	void add() {
		System.out.println("Add method from Abcde1");
	}
}
public class InterfaceSample2 extends Abcde2 implements Abc2, Abcd2{

	public void add() {

		System.out.println("Add method from InterfaceSample class");
	}

	public void div() {

		System.out.println("Division");

	}

	public void mul() {
		System.out.println("Multiplication");

	}

	public void sub() {

		System.out.println("Subtraction");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceSample2 bb = new InterfaceSample2();
		bb.add();
		bb.div();
		bb.mul();
		bb.sub();
		
		Abcde2 dd = new Abcde2();
		dd.add();

	}

}