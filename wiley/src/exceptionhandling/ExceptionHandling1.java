package exceptionhandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0);
			
			int a[]= {10,20,30,40};
			System.out.println(a[1]);
			System.out.println(a[4]);
			
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Exception raised"+e1);
			
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Exception raised"+e2);
		}
		
		System.out.println("Hi");

	}

}
