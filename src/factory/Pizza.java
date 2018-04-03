package factory;

public abstract class Pizza {

	public abstract void prepare();
		
	public void bake() {
		System.out.println("baking the pizza");
	}
	
	public void cut() {
		System.out.println("slicing out pizza");
	}
	
	public void box() {
		System.out.println("boxing the pizza");
	}
	
}
