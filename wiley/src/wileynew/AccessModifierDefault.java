package wileynew;

// default variables and methods cannot be accessed across packages
// only within a package
class Abc{
	int a = 20;
	void m1() {
		System.out.println("Default m1 method");
	}
	
}

public class AccessModifierDefault extends Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierDefault am = new AccessModifierDefault();
		am.m1();
	}

}
