package testone;
public class TestGeneric {

	public static void main(String[] args) {
//		TestGenericGet Ob=new TestGenericGet();
//		Ob.SetX(new Integer(100));
//		Integer intX=(Integer)Ob.GetX();
//		System.out.println(intX);
//		
//		Ob.SetY(new Float(150.00f));
//		Float FloatY=(Float)Ob.GetY();
//		System.out.println(FloatY);
//		
//		Point<Integer> P1=new Point<Integer>();
//		P1.SetX(new Integer("100"));
//		System.out.println(P1.GetX());
//		
//		Point<Float> P2=new Point<Float>();
//		P2.SetX(new Float("600.2f"));
//		System.out.println(P2.GetX());

		Test.Print1(6);
		Test.<String>Print1("AAA");
		
		Test a=new Test();
		a.Print2(555f);
		a.<Double>Print2(new Double(6.6));
		
	}
	static class Test{
		static <A> void Print1(A a) {
			System.out.println(a.getClass().getName()
					+"="+a);
		}
		<A> void Print2(A a) {
			System.out.println(a.getClass().getName()
					+"="+a);
		}
	}

}
