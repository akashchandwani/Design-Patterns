package factory;

public class PepporiniPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("preparing "+ this.getClass());
	}

}
