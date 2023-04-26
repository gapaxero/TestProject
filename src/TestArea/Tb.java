package TestArea;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Tb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
	
		while(true) {
			String str = "";
			String res = "";
			
			// 先處理輸入自串
			int num = sc.nextInt();
			if(num <= 1 || num >= 100) break;
			
			String input = sc2.nextLine();
			String[] list = input.split(" ");
			if(list.length != num) {
				System.out.println("超出數量");
				break;
			}else {
				for(String i : list) {
					str+=i;
				}
			}
			
			// 再處理取字元
			int cha = sc3.nextInt();
			if(cha <= 1 || cha >= str.length()) break;						
			String at = sc4.nextLine();
			String[] list2 = at.split(" ");
			if(list2.length != cha) {
				System.out.println("超出數量");
				break;
			}else {
				for(String i : list2) {
					res += str.charAt(Integer.valueOf(i)-1);
				}
				System.out.println(res);
				break;
			}			
			
		}
		
		
		sc.close();
		sc2.close();
		sc3.close();
		sc4.close();
	}
	

}
