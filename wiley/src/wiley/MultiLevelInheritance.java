package wiley;

class GrandParent {
	void nose() {
		System.out.println("Grandparent's nose");
	}
}

class Parent extends GrandParent {
	void hairs() {
		System.out.println("Parent's hair");
	}
}

public class MultiLevelInheritance extends Parent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance p = new MultiLevelInheritance();
		p.hairs();
		p.nose();

	}
}
