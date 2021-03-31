package exceptionhandling;

import java.io.IOException;

class TC{
	void m1() throws IOException {
		throw new IOException("m1 method");
	}
}

public class ThrowsClasstoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC t = new TC();
		try {
			t.m1();
		}
		catch(IOException e) {
			System.out.println("Exception raised"+e);
		}

	}

}
