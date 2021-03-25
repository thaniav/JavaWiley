package collections;

import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap map = new TreeMap();

		map.put("Thania", new Double(11.1));
		map.put("Vivek", new Double(10.1));

		// Can add different types of values
		map.put("Ojeshvi", new Integer(20));
		map.put("Saurabh", new Double(11.1));
		map.put("Thania", new Double(15.2));

		// Different types of keys not allowed
		// map.put(1,new Double(10.1))

		System.out.println(map);

		// Update
		map.put("Thania", new Double(20.1));
		System.out.println(map);

		// Null keys not allowed
		// map.put(null, new Double(20.1));

		// Null values are allowed
		map.put("Rahul", null);
		System.out.println(map);

		// Reading values using get
		map.get("Thania");

		// Deleting
		map.remove("Thania");
		System.out.println(map);
		
		

	}

}
