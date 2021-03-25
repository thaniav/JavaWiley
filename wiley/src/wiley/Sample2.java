package wiley;

public class Sample2 {
	static byte a = 45, b = 45;

	void sum() {
		System.out.println((short) (a + b));
	}

	void multiply() {
		System.out.println((short) (a * b));
	}

	void divide() {
		System.out.println((short) (a / b));
	}

	void subtract() {
		System.out.println((short) (a - b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s = new Sample2();

		s.multiply();
		s.divide();
		s.sum();
		s.subtract();
		s.multiply();

	}

}
