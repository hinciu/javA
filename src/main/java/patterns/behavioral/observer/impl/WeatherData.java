package patterns.behavioral.observer.impl;

import patterns.behavioral.observer.PublisherSubject;
import patterns.behavioral.observer.SubscriberObserver;

import java.util.ArrayList;

public class WeatherData implements PublisherSubject {
    private ArrayList<SubscriberObserver> observers;
    private float tmp;
    private float hum;
    private float press;


    WeatherData() {
        observers = new ArrayList<SubscriberObserver>();
    }

    @Override
    public void registerSubscriberObserver(SubscriberObserver subscriberObserver) {
        observers.add(subscriberObserver);
    }

    @Override
    public void removeSubscriberObserver(SubscriberObserver subscriberObserver) {
        int i = observers.indexOf(subscriberObserver);
        observers.remove(i);
    }

    @Override
    public void notifySubscriberObserver() {
        for (SubscriberObserver ob: observers) {
            ob.update(tmp,hum,press);
        }
    }

    public void measuerementsChanged(){
        notifySubscriberObserver();
    }
    public void setMesurements(float t ,float h , float p){
        this.tmp = t;
        this.hum = h;
        this.press = p;
        measuerementsChanged();
    }

}
