package TestPol;

public class Dog implements Animal,Food{

	@Override
	public void Speak() {
		System.out.println("汪汪汪");
	}
	@Override
	public void Move() {
		System.out.println("跑");
	}
	@Override
	public void Play() {
		System.out.println("丟球");
	}
	@Override
	public void Eat() {
		System.out.println(dogfood);
	}


}
