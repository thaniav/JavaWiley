package wiley;

public class VariableArguments {

	// Not possible - error
	// void m1(String...b, int ...a) { }

	void m1(int... a) {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArguments va = new VariableArguments();
		va.m1(1);
		va.m1(1, 2);
		va.m1(1, 2, 3);
	}

	// Cannot take variable

}
