package strategy;

public abstract class Duck {

	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	public Duck() {
		
	}
	
	public abstract void Display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All Ducks swim, even decoys!");
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
