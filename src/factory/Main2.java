package factory;

public class Main2 {

	public static void main(String[] args) {
		Pizza pizza = new CheezePizza();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
