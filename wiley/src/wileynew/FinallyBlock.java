package wileynew;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			System.out.println(10/0);
		}
catch(ArithmeticException e) {
	System.out.println("Exception raised");
}
		finally {
			System.out.println("finally");
		}
	}

}
