package leetcode.FunctionTest;

abstract class AA {
	String a = "CC";
	
	public void getA() {
		System.out.println("A");
	}
	
	public void getB() {
		System.out.println("B");
	}
	
	public abstract void getEng();
	
	
}	

interface BB{
	int a = 5;
	public abstract void show();
	
	public void get();
	
}


class test2 extends AA{
	@Override
	public void getA() {
		// TODO Auto-generated method stub
		super.getA();
	}
	
	@Override
	public void getEng() {
		// TODO Auto-generated method stub
		
	}
	
}

class test implements BB{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
	
}











