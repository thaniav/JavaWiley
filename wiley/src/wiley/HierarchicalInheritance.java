package wiley;

class GrandParent2 {
	void nose() {
		System.out.println("Grandparent's nose");
	}
}

class Parent2 extends GrandParent {
	void hairs() {
		System.out.println("Parent's hair");
	}
}

public class HierarchicalInheritance extends GrandParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance p = new MultiLevelInheritance();
		p.hairs();
		p.nose();

	}

}
