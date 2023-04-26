package testAbs;

public class TT extends AbstractTestClass {

    public static void main(String[] args) {
        TT tt = new TT();
        tt.testfun("A", "B");
    }

    @Override
    public void testfun(String a, String b) {
        System.out.println(a);
        System.out.println(b);

    }

}
