package lambdatest;

public class CheckCanSwim implements IChecker{
	@Override
	public boolean test(Animal a) {
		return a.canSwim();
	}
	
}
