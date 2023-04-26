package TestForEach;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;
@SuppressWarnings("unused")
public class TestDo {

	public static void main(String[] args) {

		int [] b= {1,2,3,4,5,6};
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		for (int i : b) {
			System.out.println(b[i-1]);
		}
		
		

	}

}
