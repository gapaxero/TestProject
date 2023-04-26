package review20200925;

class TestF {
public int a=10;
public int b=15;
public int sum=0;
	public void CountA() {
		sum=a+b;
		System.out.println(sum);
	}
	public void CountB() {
		sum=a*b;
		System.out.println(sum);
	}
}

class TestC extends TestF{
	@Override
	public void CountA() {
		System.out.println(a-b);
	}
}

