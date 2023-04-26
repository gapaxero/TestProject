package lambdatest;

public class CheckCanJump implements IChecker{
	@Override
	public boolean test(Animal a) {
		return a.canJump();
	}
}
