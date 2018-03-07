package observer.java;

import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		WeatherData observable = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(observable);
		
		observable.measurementChanged(1, 2, 3);
	}
}
