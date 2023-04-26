package testone;

public class GetLoop {
	public void printS() {
		for(int i=0;i<=15;i++) {
			System.out.print("=");
		}System.out.println("");
	}
	public void Loop1(int a) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println("");
		}
	}
	public void Loop2(int a) {
		int time=a;
		for(int i=0;i<a;i++) {
			time--;
			for(int j=0;j<=time;j++) {
				System.out.print("*");
			}System.out.println("");
		}
	}
	public void Loop3(int a) {
		int count=a;
		for(int i=0;i<a;i++) {
			count--;
		  for(int k=0;k<count;k++)System.out.print(" ");
			for(int j=0;j<=i;j++) {				
				System.out.print("*");
			}System.out.println("");
		}
	}
	public void Loop4(int a) {
		int time=a,count=0;
		for(int i=0;i<a;i++) {
			time--;count++;
		  for(int k=1;k<count;k++)System.out.print(" ");
			for(int j=0;j<=time;j++) {
				System.out.print("*");
			}System.out.println("");
		}
	}
	public void Loop5(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++)
				System.out.print(" ");			
				for(int k=1;k<=2*i-1;k++)
					System.out.print("*");			
			System.out.println("");
		}
	}
	
	
	

}
