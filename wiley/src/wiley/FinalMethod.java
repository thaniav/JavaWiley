package wiley;

// Final method cannot be overridden. 

class FinalMethodParent{
	
	final void m1() {
		System.out.println("method m1");
	}
}

public class FinalMethod extends FinalMethodParent{
	final  int a = 10;
	
	// void m1() {	} Not possible, will show error 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 final FinalVariable fv = new FinalVariable();


fv.m1();

	}

}
