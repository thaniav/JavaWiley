package wiley;

class Akash {
	int a = 10;
	int b = 20;
}

public class DemoSuper extends Akash {
	int a = 30;
	int b = 40;

	void m1(int a, int b) {
		System.out.println(a + b);
		System.out.println(this.a + this.b);
		System.out.println(super.a + super.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSuper ds = new DemoSuper();
		ds.m1(5, 5);
	}

}
