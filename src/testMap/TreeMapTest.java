package testMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		//Hashmap
		HashMap<String, String> hmap = new HashMap<String, String>();		
		hmap.put("1", "aaa"); hmap.put("2", "bbb"); hmap.put("3", "ccc");
		Iterator<String> ite1 = hmap.keySet().iterator();
		
		while(ite1.hasNext()) {
			System.out.print("HM:" + hmap.get(ite1.next()) + " ");
		}
		System.out.println("\n" + "===============================");
		//Hashtable
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("1", "aaa"); table.put("2", "bbb"); table.put("3", "ccc");
		Iterator<String> ite2 = table.keySet().iterator();
		
		while(ite2.hasNext()) {
			System.out.print("HTM:" + table.get(ite2.next()) + " ");
		}
		System.out.println("\n" + "===============================");
		//Treemap
		TreeMap<String, String> tmap = new TreeMap<String, String>();		
		tmap.put("1", "aaa"); tmap.put("2", "bbb"); tmap.put("3", "ccc");
		Iterator<String> ite3 = tmap.keySet().iterator();
		
		while(ite3.hasNext()) {
			System.out.print("TM:" + tmap.get(ite3.next()) + " ");
		}
		
	}

}
