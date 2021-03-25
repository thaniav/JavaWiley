package wiley;

public class Sample1 {

	int sum(int a, int b) {
		return a + b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1 s = new Sample1();

		System.out.print(s.sum(5, 5));
		System.out.print(s.multiply(5, 5));
		System.out.print(s.divide(5, 5));

	}
}
