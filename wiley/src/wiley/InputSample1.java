package wiley;

import java.util.*;

public class InputSample1 {

	static String a;
	static int b;
	int c;

	void dis(String a, int b) {

		System.out.println("the name is " + a);
		System.out.println("the age is " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		InputSample1 v = new InputSample1();
		System.out.println("enter name ");
		a = s.nextLine();
		System.out.println("enter age ");
		b = s.nextInt();
		v.dis(a, b);

	}

}
