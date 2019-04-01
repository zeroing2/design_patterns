package main;

import observer.CurrentConditionsDisplay;
import observer.StatisticsDisplay;
import subject.WeatherData;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();  //subject
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);  //observer1
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData); //observer2
		
		weatherData.registerObserver(currentDisplay);
		weatherData.registerObserver(statisticsDisplay);

		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(80, 20, 30.4f);
		
		weatherData.removeObserver(currentDisplay);
		weatherData.setMeasurements(800, 20, 30.4f);
		
		weatherData.removeObserver(statisticsDisplay);
		weatherData.setMeasurements(800, 200, 30.4f);
	}

}
