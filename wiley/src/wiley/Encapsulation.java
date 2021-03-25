package wiley;

class ABC {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}

public class Encapsulation extends ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e = new Encapsulation();
		e.setA(10);
		System.out.println(e.getA());
		e.setB(20);
		System.out.println(e.getB());
	}

}
