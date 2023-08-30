package com.lldpractice.lldpractice.notifyme.observable;

import com.lldpractice.lldpractice.notifyme.observer.Observer;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(Object data);
}
