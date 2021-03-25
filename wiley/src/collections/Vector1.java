package collections;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("E");
		v.add("A");
		v.add("E");
		v.add("A");
		v.add(null);
		v.add(new Integer(101));
		System.out.println(v);

		v.add(3, "X");
		System.out.println(v);
		v.set(2, "Y");
		System.out.println(v);

		v.get(2);

		v.remove(new Integer(101));
		System.out.println(v);

		v.remove(1);
		System.out.println(v);
	}

}
