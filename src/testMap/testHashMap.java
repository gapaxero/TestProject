package testMap;
import java.util.*;
import java.util.Map.Entry;

public class testHashMap {

	public static void main(String[] args) {
		Map<String,String> map1=new HashMap<>();
		Map<String,String> map2=new HashMap<>();
		HashMap<String,String> hashmap1 = new HashMap<>();
		TreeMap<String,String> tmap1 = new TreeMap<>();
		Collection<String> col1=map1.values();
		Collection<String> col2=map1.keySet();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Map<String,String>> list2 = new ArrayList<Map<String,String>>();
		list1.addAll(map1.values());
		map1.put("1","A"); 	//if same Key新增的值會覆蓋原本的值
		map1.put("2","B");
		map1.put("2","BB");
		map1.put("3","C");
		map1.put("4","D");
		map1.put("5","E");
		hashmap1.putAll(map1);
		
		Set<String> KeySet=map1.keySet();
		Iterator<String> it = KeySet.iterator();
		while(it.hasNext()) {
			 String key = (String)it.next();
	         String value = map1.get(key); //有了鍵就可以通過map集合的get方法獲取其對應的値
	         System.out.println("key: " + key + ", vaule: " + value);
		}
		
		list2.add(hashmap1);
		System.out.println(hashmap1);		
		String aaa =list2.get(0).get("1");
		System.out.println(aaa);
	}
}



//System.out.println("判斷Key值是否存在: containsKey= "+map.containsKey("1"));
//System.out.println("依Key取值: get= "+map.get("01"));
//System.out.println("輸出所有value: values= "+map.values());
//System.out.println("輸出所有Key-Value: map= "+map);
//System.out.println("輸出Collection物件: "+col);
