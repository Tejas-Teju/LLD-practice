package com.lldpractice.lldpractice.notifyme.observer;

import com.lldpractice.lldpractice.notifyme.observable.Observable;

public class IndiaToday implements Observer {
    @Override
    public void update(Observable observable, Object data) {
        System.out.println("IndiaToday: " + "Class Name: " + observable.getClass().getName() + " : " + data);
    }
}
