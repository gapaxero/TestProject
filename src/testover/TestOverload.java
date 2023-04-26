package testover;
public class TestOverload {

	public static void main(String[] args) {
		double a= TestMethod2.sum(5.2f, 6);
		double b= TestMethod2.sum(7, 9.5f);
		System.out.println(a);
		System.out.println(b);
//		TestF a=new TestF(10,2);
//		TestC b=new TestC(8,6);
//		a.CountA();
//		b.CountA();
		
	}
}

class TestMethod2 {	
	//Overload
	public static int sum(int a1,int b1) {
		return(a1+b1);
	}
	public static float sum(float a2,int b2) {
		return(a2+2+b2+2);
	}
	public static float sum(int a3,float b3) {
		return(a3-b3);
	}

}
