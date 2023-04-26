package TestPol;

public class TestDo {

	public static void main(String[] args) {
		Animal d =new Dog();
		Animal c =new Cat();
		d.Speak();c.Speak();
		move(d);move(c);
		play(d,c);
		eat(d);eat(c);
		
	}

	public static void move(Animal a) {
		a.Move();
	}
	public static void eat(Animal a) {
		a.Eat();
	}
	
	public static void play(Animal a,Animal b) {
		a.Play();
		b.Play();
	}

}
