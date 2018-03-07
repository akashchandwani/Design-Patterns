package observer;

public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver(float temprature, float humidity, float pressure);
	
}
