package com.lldpractice.lldpractice.notifyme.observer;

import com.lldpractice.lldpractice.notifyme.observable.Observable;

public interface Observer {
    void update(Observable observable, Object data);
}
