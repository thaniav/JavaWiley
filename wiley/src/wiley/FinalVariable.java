package wiley;

//final variable value cannot be changed


public class FinalVariable {
	final  int a = 10;
	void m1() {
		// a=30; -  this is not possible because a is final 
		System.out.println(a);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalVariable fv = new FinalVariable();
fv.m1();

	}

}
