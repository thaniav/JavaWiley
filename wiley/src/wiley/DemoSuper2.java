package wiley;

class Akash2 {
	Akash2(int a, int b) {
		System.out.println("Super constructor");
	}
}

public class DemoSuper2 extends Akash2 {
	DemoSuper2(int a) {
		super(2, 3);
		System.out.println("Sub Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSuper2 ds2 = new DemoSuper2(5);

	}

}
