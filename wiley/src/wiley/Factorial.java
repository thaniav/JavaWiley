package wiley;

public class Factorial {

	static int factorial(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n = n - 1;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(factorial(5));

	}

}
