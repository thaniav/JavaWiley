package wiley;

public class Sample3Variables {

	int a;
	int b;

	void m1(int c, int d) {
		a = c;
		b = d;
	}

	void m2() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		Sample3Variables s = new Sample3Variables();

		s.m1(2, 4);
		s.m2();

	}
}
