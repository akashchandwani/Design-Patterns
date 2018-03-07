package observer.java;

import java.util.Observable;
import java.util.Observer;

import observer.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temprature;
	private float humidity;
	private float pressure;
	private Observable weatherData;

	@Override
	public void display() {
		System.out.println("CurrentConditionsDisplay : " + "temprature = " + temprature + ", humidity = " + humidity
				+ ", pressure = " + pressure);
	}

	public CurrentConditionsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			this.temprature = ((WeatherData) o).getTempratureInCelcius();
			this.humidity = ((WeatherData) o).getHumidity();
			this.pressure = ((WeatherData) o).getPressure();
		}
		display();

	}

}
