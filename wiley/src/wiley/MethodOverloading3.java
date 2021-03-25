package wiley;

public class MethodOverloading3 {
	void m1(int a, int b) {
		System.out.println("m1 method 1");
	}

	void m1(long c, long d) {
		System.out.println("m1 method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading3 mb = new MethodOverloading3();
		mb.m1(1, 2);
		mb.m1(20l, 50l);

	}
}
