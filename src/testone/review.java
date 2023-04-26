package testone;
import java.util.*;
public class review {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] aaa=input.split(" ");
		int stop=0;
			for(int i=0;i<aaa.length;i++) {
				for(int j=1;j<i;j++) {
					if(aaa[i] == aaa[j])stop=j;
					System.out.println(stop);
				}
			}System.out.println(stop);
//		for(int k=0;k<=stop;k++) {
//			System.out.println(aaa[k]);
//		}
	sc.close();
	}

}
