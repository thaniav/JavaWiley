package wiley;

public class MethodOverloading2 {
	void m1(String s) {
		System.out.println("m1 method 1");
	}

	void m1(int a) {
		System.out.println("m1 method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading2 mb = new MethodOverloading2();
		mb.m1("Hello");
		mb.m1(2);

	}
}
