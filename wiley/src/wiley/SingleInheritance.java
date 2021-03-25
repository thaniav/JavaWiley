package wiley;

class Parent1 {
	void hairs() {
		System.out.println("Parent's hair");
	}
}

public class SingleInheritance extends Parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance p = new SingleInheritance();
		p.hairs();

	}

}
