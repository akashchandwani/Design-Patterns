package strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Quack();
	}

	@Override
	public void Display() {
		System.out.println("I am a model duck!");
		
	}
}
