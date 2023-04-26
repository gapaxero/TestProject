package testone;

import java.util.ArrayList;

public class TestEquals {
	
	public static void main(String[] args) {
		ArrayList<String> res = new ArrayList<String>();
		
		res = ming("aaa","bbb","ccc","ddd","eee","fff","ggg");
		
		System.out.println(res);
	}
	
	public static ArrayList<String> ming(String... para) {
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<para.length;i++) {
			list.add(para[i]);
		}
		
		return list;
	}

}
