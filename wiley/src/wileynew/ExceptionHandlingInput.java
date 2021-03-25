package wileynew;
import java.util.*;

public class ExceptionHandlingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		try {
			System.out.println("Result: "+(a/b));
		}
		
		catch(ArithmeticException e) {
			System.out.println("Exception raised "+e);
		}
	}

}
