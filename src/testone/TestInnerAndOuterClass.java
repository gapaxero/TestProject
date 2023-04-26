package testone;

import testone.OuterClass1.InnerClass1;

@SuppressWarnings("unused")
public class TestInnerAndOuterClass {
	public static void main(String[] args) {
		OuterClass1 o1=new OuterClass1();
		o1.printOut1();
		InnerClass1 i1=o1.new InnerClass1();
		i1.printInner1();
	}

}

class OuterClass1{
	public int a=10;
	public static int b=20;
	public void printOut1(){
		System.out.println("OuterClass1 a= "+a);
	}
	
	class InnerClass1{
		public int a=15;
		public int b=25;
		public void printInner1(){
			int a=17;
			System.out.println("InnerClass==>");
			System.out.println("InnerClass1's a="+this.a);
			System.out.println("OuterClass1's a="+OuterClass1.this.a);
			System.out.println("區域變數a= "+a);
			System.out.println("內部變數a="+InnerClass1.this.a);
			System.out.println("全域變數b= "+OuterClass1.b);
			
			
		}
	}
}