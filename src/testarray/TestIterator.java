package testarray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0 ; i <= 100 ; i++) {
			list.add(String.valueOf(i));
		}		
		
		Iterator<String> iteO = list.iterator();
		Iterable<String> iteA = list;
		
		while(iteO.hasNext()) {
			String a = iteO.next();
			System.out.println(a);
		}
		
	}
}
