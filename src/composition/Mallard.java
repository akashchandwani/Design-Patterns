package introduction;

public class Mallard extends Duck {

	Mallard() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void Display() {
		
		
	}

}
