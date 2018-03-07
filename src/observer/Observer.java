package observer;

public interface Observer {

	/**
	 * This method is called when the subject's state changed. 
	 */
	public void update(float temprature, float humidity, float pressure);
}
