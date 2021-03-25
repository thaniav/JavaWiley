package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		HashSet s = new HashSet();
		
		
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		
		//Update
		ll.set(1, "Start");
		
		//Read
		ll.get(2);
		
		//Delete
		ll.remove(1);
		
		System.out.println("Iterator----");
		Iterator it = ll.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o + " ");
		}

		System.out.println("List Iterator----Forward");
		ListIterator li = ll.listIterator();
		while (li.hasNext()) {
			Object o = li.next();
			System.out.println(o + " ");
		}

		System.out.println("List Iterator----Backward");
		while (li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o + " ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter search key");
		String key=sc.next();
		
		Iterator it2 = ll.iterator();
		
		
		//Search operation
		int count=0;
		while (it2.hasNext()) {
			
			Object o = it2.next();
			if(o.equals(key)) {
				System.out.println("Found at " +count);
				break;
			}
			count++;
		}
		
		
	}

}
