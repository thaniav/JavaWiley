package wiley;

public class Variables {
	static int x = 100;

	void m1() {
		int a = 10;
		System.out.println("Local variable " + a);
	}

	void m2() {
		int b = 20;
		System.out.println("Local variable " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables v = new Variables();
		System.out.println(x);
		System.out.println(Variables.x);
		v.m1();

	}

}
