package strategy;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new Mallard();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.Display();
		
		modelDuck.performFly();
		modelDuck.performQuack();
		modelDuck.setFlyBehaviour(new FlyRocketPowered());
		modelDuck.performFly();
	}
}
