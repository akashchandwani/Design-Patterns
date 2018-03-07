package observer;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float temprature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	@Override
	public void display() {
		System.out.println("StatisticsDisplay : " + "temprature = " + temprature + ", humidity = " + humidity
				+ ", pressure = " + pressure);
	}

	@Override
	public void update(float temprature, float humidity, float pressure) {
		this.temprature = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

}
