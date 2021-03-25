package wiley;

public class MethodOverloading {

	void m1() {
		System.out.println("m1 method");
	}

	void m1(int a) {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mb = new MethodOverloading();
		mb.m1();
		mb.m1(2);

	}

}
