package patterns.behavioral.observer;

public interface PublisherSubject {
    public void registerSubscriberObserver(SubscriberObserver subscriberObserver);
    public void removeSubscriberObserver(SubscriberObserver subscriberObserver);
    public void notifySubscriberObserver();

}
