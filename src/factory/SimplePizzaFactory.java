package factory;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("CheezePizza ")) {
			pizza = new CheezePizza();
		} else if (type.equals("perrporiniPizza")) {
			pizza = new PepporiniPizza();
		}
		return pizza;
	}
}
