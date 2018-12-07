package patterns.behavioral.observer.impl;

import patterns.behavioral.observer.SubscriberObserver;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        SubscriberObserver subscriberObserver = new CurrentConditiosDisplay(weatherData);
        SubscriberObserver subscriberObserver2 = new ForecastConditionsDisplay(weatherData);
        weatherData.setMesurements(1,2,3);
        weatherData.setMesurements(44,44,44);

    }
}
