package com.lldpractice.lldpractice.notifyme.observer;

import com.lldpractice.lldpractice.notifyme.observable.Observable;

public class BBC implements Observer {
    @Override
    public void update(Observable observable, Object data) {
        System.out.println("BBC: " + "Class Name: " + observable.getClass().getName() + " : " + data);
    }
}
