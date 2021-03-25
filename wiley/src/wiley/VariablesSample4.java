package wiley;

public class VariablesSample4 {

	int a;
	int b;

	void m1(int a, int b) {
		this.a = a;
		this.b = b;
		m2();
	}

	void m2() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesSample4 s = new VariablesSample4();

		s.m1(2, 4);
		s.m2();
	}

}
