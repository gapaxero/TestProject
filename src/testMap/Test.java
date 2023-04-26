package testMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		List<Entry<String, String>> list = new ArrayList<>();
		Map<String, String> tab = new TreeMap<String, String>();
		tab.put("a", "aaa");tab.put("b", "bbb");tab.put("c", "ccc");tab.put("d", "ddd");
		tab.put("e", null);
		System.out.println(tab);
		Set<Entry<String, String>> set = tab.entrySet();
		
		list = set.stream()
		          .filter(node -> node.getValue() != null)
		          .collect(Collectors.toList());
		
		set = set.stream()
		         .filter(node -> "a".equals(node.getKey()))
		         .collect(Collectors.toSet());
		
		System.out.println(list);
		System.out.println(set);
	}
		
}
