package decorator;

public class Main {

	public static void main(String[] args) {
		Beverage myDrink = new Whip(new Soy(new Mocha(new Mocha(new Espresso()))));
		
		System.out.println("Your order is - \n");
		System.out.println(myDrink.getDescription());
		System.out.println(String.format("%.02f", myDrink.cost()));
		
	}
}
