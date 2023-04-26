package TestGen;

public class Test<C extends Comparable<?>> {
    public C value;
    public Test<C> I;

    public Test(C value, Test<C> b) {
        this.value = value;
        this.I = b;
    }

}
