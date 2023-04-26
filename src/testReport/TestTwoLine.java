package testReport;

import java.util.ArrayList;
import java.util.HashMap;

public class TestTwoLine {
	public static void main(String[] args) {
		int c=0;
		ArrayList<String> a1 = new ArrayList<String>();//001
		a1.add("001");a1.add("單筆轉帳");a1.add("        X999999");a1.add("付款人統編:A123456789");a1.add("轉出帳號:5454545454");a1.add("金額:1000");a1.add("哭阿有限公司");
		ArrayList<String> a2 = new ArrayList<String>();//002
		a2.add("002");a2.add("單筆轉帳");a2.add("        X999999");a2.add("付款人統編:A987654321");a2.add("轉出帳號:5454545454");a2.add("金額:1000");a2.add("哭阿有限公司");
		HashMap<String, ArrayList<String>> map1 = new HashMap<String,  ArrayList<String>>();
		map1.put("001", a1);
		map1.put("002", a2);
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("001");b.add("收款人統編:A235895646");b.add("轉入帳號:5454545454");b.add("金額:9999");b.add("自行轉帳帳號1");
		b.add("001");b.add("收款人統編:A956469517");b.add("轉入帳號:5454545454");b.add("金額:988");b.add("自行轉帳帳號1");
		b.add("002");b.add("收款人統編:A649731852");b.add("轉入帳號:5454545454");b.add("金額:98542");b.add("自行轉帳帳號1");
		HashMap<String, ArrayList<String>> map2 = new HashMap<String,  ArrayList<String>>();
		
		System.out.println(map1.get(b.get(0)));
		System.out.println(map1.get(b.get(10)));
		
		
		
	}

}
