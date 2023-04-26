package testarray;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");list.add("b");list.add("c");
		list.add("d");list.add("f");list.add("g");
		
		for(String i : list) {
			if(i.equals("b")) continue;
			else System.out.println(i);
		}
		
		
	}
}
