package patterns.behavioral.observer.impl;

import patterns.behavioral.observer.DisplayEl;
import patterns.behavioral.observer.PublisherSubject;
import patterns.behavioral.observer.SubscriberObserver;

public class ForecastConditionsDisplay implements SubscriberObserver, DisplayEl {
    private PublisherSubject wetherData;
    private float temp;
    private float hum;
    private float pr;

    ForecastConditionsDisplay(PublisherSubject weatherData){
        this.wetherData = weatherData;
        weatherData.registerSubscriberObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast:"+" "+temp + "-" + hum);
    }

    @Override
    public void update(float temp, float humidity, float preasure) {
        this.temp = temp;
        this.hum = humidity;
        this.pr = preasure;
        display();
    }
}
