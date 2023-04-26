package lambdatest;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

	public static void main(String[] args) {
		List<Animal> list =new ArrayList<>();
		list.add(new Animal("fish",false,true));
		list.add(new Animal("monkey",true,false));
		list.add(new Animal("rabbit",true,false));
		list.add(new Animal("human",true,true));
		System.out.println("=======lambda=========");
		check(list, checker -> checker.canSwim());
		System.out.println("=======normal=========");
		check(list, new CheckCanJump());
	}

	public static void check(List<Animal> list ,IChecker checker) {
		for(Animal a: list) {
			if(checker.test(a)) {
				System.out.println(a);
			}
		}
	}

}
