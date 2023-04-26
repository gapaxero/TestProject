package TestPol;

public class Cat implements Animal,Food{
	@Override
	public void Speak() {
		System.out.println("喵喵喵");	
	}
	@Override
	public void Move() {
		System.out.println("走");
	}
	@Override
	public void Play() {
		System.out.println("逗貓棒");
	}
	@Override
	public void Eat() {
		System.out.println(catfood);
	}

}
