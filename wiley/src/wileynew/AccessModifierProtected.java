package wileynew;

//Protected access modifier can be accessed within a package 
// and across packages only through subclasses and importing the package
// where it resides

import DemoProtectedPackage.DemoProtected;



public class AccessModifierProtected extends DemoProtected{
	
	public static void main(String[] args) {
		
		AccessModifierProtected pm = new AccessModifierProtected();
	
		pm.m1();

}
	
}
