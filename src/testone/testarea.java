package testone;
import java.lang.*;

import java.util.*;
@SuppressWarnings("unused")
public class testarea {
	public static void main(String[] args) {
		int a=500;
		int b=600;
	//	匿名類別	
		(new Object() {
			int b=100;
			public void show() {
				System.out.println(a);
				System.out.println(this.b);
			}
			public void print() {
				System.out.println(b);
				System.out.println(this.b+a);
			}
		 }
		).print();
			
		
	//	匿名內部類別
		Object o=new Object() {
			public String toString() {
				return "Test Code";
			}
		};
		
		
	}
}
	



