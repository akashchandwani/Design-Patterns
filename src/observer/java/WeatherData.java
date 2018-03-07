package observer.java;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

	private float tempratureInCelcius;
	private float humidity;
	private float pressure;

	private ArrayList<Observer> observers = new ArrayList<>();

	public float getTempratureInCelcius() {
		return tempratureInCelcius;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	/**
	 * This method is called when the weather data is updated.
	 */
	public void measurementChanged(float temprature, float humidity, float pressure) {
		this.tempratureInCelcius = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.setChanged();
		if (this.hasChanged()) {
			notifyObservers();
			this.clearChanged();
		}
	}

}
