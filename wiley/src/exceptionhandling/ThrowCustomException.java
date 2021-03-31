package exceptionhandling;

public class ThrowCustomException {
	
	void vote(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowCustomException t = new ThrowCustomException();
		try {
		t.vote(12);
		}
		catch(Exception e) {
			System.out.println("Exception raised"+e);
		}

	}

}
