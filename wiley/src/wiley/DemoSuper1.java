package wiley;

class Akash1 {
	void m1() {
		System.out.println("M1 super");
	}
}

public class DemoSuper1 extends Akash1 {

	void m2() {
		this.m1();
		System.out.println("M2 sub");
		super.m1();
	}

	void m1() {
		System.out.println("M1 sub");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSuper1 ds1 = new DemoSuper1();

		ds1.m2();

	}

}
