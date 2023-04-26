package review20200925;

public class ConTest {

	double data; 

	public ConTest() {//這是一個合法的建構子
		data= 100.0;
		System.out.println("我是ConTest物件建構子，我把data預設成為100");
	} 
	public void MyTest(double d) { // 這不是建構子，但是是一個物件動作（無傳回值）
		data=d;
		System.out.println("我是ConTest物件動作 void Test()，我把data改為參數d的值");
	}
	public double ConTest() {// 這不是建構子，但是是一個物件動作（傳回值是double型實數）
		System.out.println("我是ConTest物件動作 double Test()，我把data傳給呼叫我的人");
		return data;
	} 
	public static void main(String[] args) {
		
		ConTest o = new ConTest(); //看看螢幕顯示甚麼？
		o.MyTest(200.0);// 看看螢幕顯示甚麼？
		double v = o.ConTest();// 看看螢幕顯示甚麼？
		System.out.println("我是ConTest物件的主程式，我得到" + v); 

	} 

}
