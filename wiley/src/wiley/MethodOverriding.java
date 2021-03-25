package wiley;

class Ayush {
	void marry() {
		System.out.println("family");
	}

	void property() {
		System.out.println("property");
	}
}

public class MethodOverriding extends Ayush {
	void marry() {
		System.out.println("campus select");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverriding mo = new MethodOverriding();
		mo.marry();
		mo.property();

	}

}
