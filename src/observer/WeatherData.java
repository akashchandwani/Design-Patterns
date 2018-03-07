package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

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
		notifyObserver(tempratureInCelcius, humidity, pressure);
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if(index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver(float temprature, float humidity, float pressure) {
		for (Observer observer : observers) {
			observer.update(temprature, humidity, pressure);
		}
	}
}
