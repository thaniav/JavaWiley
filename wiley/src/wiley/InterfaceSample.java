package wiley;

interface thania{
	void add();
	void div();
	
}

public class InterfaceSample implements thania {
	
	
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	public void div() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceSample bb = new InterfaceSample();
		bb.add();
		bb.div();

	}

	

}
