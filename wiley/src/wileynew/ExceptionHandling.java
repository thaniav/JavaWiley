package wileynew;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception raised"+e);
			
		}
		catch(Exception e2) {
			System.out.println("Exception raised"+e2);
		}
		
		System.out.println("Hi");

	}

}
