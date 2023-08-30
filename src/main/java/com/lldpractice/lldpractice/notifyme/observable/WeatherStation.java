package com.lldpractice.lldpractice.notifyme.observable;

import com.lldpractice.lldpractice.notifyme.observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements Observable {
    Set<Observer> observers = new HashSet<>(); // avoids duplicate subscriptions

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifySubscribers(Object data) {
        observers.forEach(observer -> observer.update(this, data));
    }
}
