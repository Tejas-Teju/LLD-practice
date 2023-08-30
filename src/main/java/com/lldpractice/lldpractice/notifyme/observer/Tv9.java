package com.lldpractice.lldpractice.notifyme.observer;

import com.lldpractice.lldpractice.notifyme.observable.Observable;

public class Tv9 implements Observer {
    @Override
    public void update(Observable observable, Object data) {
        System.out.println("Tv9: " + "Class Name: " + observable.getClass().getName() + " : " + data);
    }
}
