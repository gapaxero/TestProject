package testover;

class TestF {
public int a;
public int b;
public int sum=0;
    public TestF(int a,int b) {
    	this.a=a;
    	this.b=b;
    }
	public void CountA() {
		sum=a+b;
		System.out.println("父類別的CountA= "+sum);
	}
	public void CountB() {
		sum=a*b;
		System.out.println("父類別的CountB= "+sum);
	}
}

class TestC extends TestF{
	public TestC(int a, int b) {
		super(a, b);
		super.a=5;super.b=99;
	}

	@Override
	public void CountA() {
		super.CountA();
		System.out.println("TestC的CountA= "+(a-b));
		System.out.println("TestC的CountA呼叫TestF= "
		+super.sum);
	}
}
