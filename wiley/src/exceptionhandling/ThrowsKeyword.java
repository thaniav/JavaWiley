package exceptionhandling;

import java.io.IOException;

public class ThrowsKeyword {
	
	void m3() throws IOException{
		throw new IOException();
	}

	void m2() throws IOException{
		m3();
		System.out.println("m2 method");
	}
	
	void m1() {
		try {
			m2();
		}
		catch(IOException e) {
			System.out.println("Exception raised");
		}
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		ThrowsKeyword k = new ThrowsKeyword();
		k.m1();

	}

}
