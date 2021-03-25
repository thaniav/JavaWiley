package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
public static void main(String args[]) {
	TreeMap map = new TreeMap();
	
	map.put(new Integer(105), "THANIA");
	map.put(new Integer(102), "VIVEK");
	map.put(new Integer(103), "NIKITHA");
	map.put(new Integer(101), "RAHUL");
	map.put(new Integer(100), "VIVEK");
	
	System.out.println(map);
	
	//Iterating through keys
	Set s = map.keySet();
	Iterator it=s.iterator();
	while(it.hasNext()) {
		int k = (Integer) it.next();
		System.out.println(k);
	}
	
	Iterator it1=s.iterator();
	while(it1.hasNext()) {
		Object o =  it1.next();
		System.out.println(map.get(o));
	}
	
	
	
}
}
