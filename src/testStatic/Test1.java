package testStatic;

public class Test1 {
int a=10;
static int b=5;
Integer c ;
	public static void main(String[] args) {
		Test1 t =new Test1();
		int a =55;
		int b =666;
		t.print(b);
	}
	public void print() {
		System.out.println(c);
	}
	public static void print(int a){
        System.out.println(a);
	}
	static {
		System.out.println(Test1.class);
		System.out.println(Test1.class.getName());
		System.out.println(Test1.class.getSimpleName());
	}
}

