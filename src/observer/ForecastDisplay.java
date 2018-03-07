package observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private float tempratureInCelcius;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	@Override
	public void display() {
		System.out.println("ForecastDisplay : " + "temprature = " + tempratureInCelcius + ", humidity = " + humidity
				+ ", pressure = " + pressure);
	}

	@Override
	public void update(float temprature, float humidity, float pressure) {
		this.tempratureInCelcius = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

}
