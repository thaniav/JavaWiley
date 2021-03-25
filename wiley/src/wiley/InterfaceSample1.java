package wiley;

interface Abc1{
	void add();
	void div();
	
}

interface Abcd1 {
	void mul();
	void sub();
}

public class InterfaceSample1 implements Abc1, Abcd1 {

	
	public void add() {
		
		System.out.println("hello");
	}

	public void div() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

	public void mul() {
		System.out.println("hi");
		
	}

	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceSample1 bb = new InterfaceSample1();
		bb.add();
		bb.div();

	}



	

}
