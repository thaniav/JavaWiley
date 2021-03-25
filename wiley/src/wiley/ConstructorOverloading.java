package wiley;

public class ConstructorOverloading {

	ConstructorOverloading() {
		System.out.println("Without parameter");
	}

	ConstructorOverloading(int a) {
		System.out.println("With parameter");
	}

	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co1 = new ConstructorOverloading(5);

	}

}
