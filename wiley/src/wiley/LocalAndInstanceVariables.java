package wiley;

public class LocalAndInstanceVariables {

	int a = 10;
	int b = 20;

	void m1(int c, int d) {
		System.out.println(a + b);
		System.out.println(this.a + this.b);
	}

	public static void main(String[] args) {

		LocalAndInstanceVariables s = new LocalAndInstanceVariables();

		s.m1(2, 3);

	}
}
