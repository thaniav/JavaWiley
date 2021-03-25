package wileynew;

class ParentPM{
	private int b=10;
}


public class AccessModifierPrivate extends ParentPM{
	private int a=10;
	
	private void m1() {
		System.out.println("Private method m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierPrivate pm = new AccessModifierPrivate();
		System.out.println(pm.a);
		pm.m1();
		
		// pm.b; Not accessible because it is private
		

	}

}
