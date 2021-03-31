package exceptionhandling;

public class ExceptionArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= {10,20,30,40};
			System.out.println(a[1]);
			System.out.println(a[4]);
		}
	
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Exception raised "+e2);
		}
		
		System.out.println("Hi");

	}

}
