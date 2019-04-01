package observer;

import pattern_interface.DisplayElement;
import pattern_interface.Observer;
import pattern_interface.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.toString() + ": " + temperature + "F degrees and " + humidity + "% huminity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
