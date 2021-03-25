package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		// Create
		ArrayList al = new ArrayList();
		al.add(new Integer(10));
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");

		System.out.println(al);

		//Read
		al.get(2);

		//Update
		al.set(2, "X");
		System.out.println(al);

		//Delete
		al.remove("X");

		System.out.println(al);

		System.out.println("Iterator----");
		Iterator it = al.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o + " ");
		}

		System.out.println("List Iterator----Forward");
		ListIterator li = al.listIterator();
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
