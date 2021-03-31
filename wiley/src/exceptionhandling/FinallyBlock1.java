package exceptionhandling;

public class FinallyBlock1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			//Enter this if we dont want to go the finally block
			System.exit(2);
			System.out.println(10/0);
		}
catch(ArithmeticException e) {
	System.out.println("Exception raised");
	//Program terminates because of this exception
	System.out.println(10/0);
}
		finally {
			System.out.println("finally");
		}
	}

}
