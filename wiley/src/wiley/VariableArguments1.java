package wiley;

public class VariableArguments1 {

	// void m2(int ...a, char c) {} Not possible - error
	void m1(char c, int... a) {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArguments va = new VariableArguments();
		va.m1(1);
		va.m1('s', 2);
		va.m1('s', 1, 2, 3);
	}
}
