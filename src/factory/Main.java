package factory;

public class Main {

	public static void main(String[] args) {
		Pizza pizza = new CheezePizza();
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
