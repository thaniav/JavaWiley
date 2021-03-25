package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector2 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");

		System.out.println("Enumeration----");
		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o + " ");
		}

		System.out.println("Iterator----");
		Iterator it = v.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o + " ");
		}

		System.out.println("List Iterator----Forward");
		ListIterator li = v.listIterator();
		while (li.hasNext()) {
			Object o = li.next();
			System.out.println(o + " ");
		}

		System.out.println("List Iterator----Backward");
		while (li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o + " ");
		}

	}

}
