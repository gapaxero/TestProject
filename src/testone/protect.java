package testone;

public class protect {

	public static void main(String[] args) {
		star(5);
		sum(15,5);
		star(5);
		//System.out.println(a);
	}
	public static int star(int a) {
		for(int i=0;i<2*a;i++) {
			System.out.print("*");		
		}
		System.out.println("");
		return a;
	}
	public static int sum(int a,int b) {		
		for(int i=1;i<=a;i++) {
			b+=i;
			System.out.println(b);
		}
		//	System.out.print(b);
		return a-b;
	}
}
