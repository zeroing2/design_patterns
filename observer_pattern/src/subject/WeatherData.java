package subject;

import java.util.ArrayList;

import pattern_interface.Observer;
import pattern_interface.Subject;

public class WeatherData implements Subject {

	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i<observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float huminity, float pressure) {
		this.temperature = temperature;
		this.humidity = huminity;
		this.pressure = pressure;
		
		measurementsChanged();
	}
}
