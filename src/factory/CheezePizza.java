package factory;

public class CheezePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing "+ this.getClass().getSimpleName());
	}

}