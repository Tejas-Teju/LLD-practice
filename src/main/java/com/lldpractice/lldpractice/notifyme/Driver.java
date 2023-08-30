package com.lldpractice.lldpractice.notifyme;

import com.lldpractice.lldpractice.notifyme.observable.NewsAgency;
import com.lldpractice.lldpractice.notifyme.observable.Observable;
import com.lldpractice.lldpractice.notifyme.observable.WeatherStation;
import com.lldpractice.lldpractice.notifyme.observer.BBC;
import com.lldpractice.lldpractice.notifyme.observer.IndiaToday;
import com.lldpractice.lldpractice.notifyme.observer.Observer;
import com.lldpractice.lldpractice.notifyme.observer.Tv9;

public class Driver {
    public static void main(String[] args) {
        Observable newsAgency = new NewsAgency();
        Observable weatherStation = new WeatherStation();

        Observer indiaToday = new IndiaToday();
        Observer tv9 = new Tv9();
        Observer bbc = new BBC();

        weatherStation.subscribe(indiaToday);
        weatherStation.subscribe(indiaToday); // duplicate subscription
        weatherStation.subscribe(bbc);
        newsAgency.subscribe(indiaToday);
        newsAgency.subscribe(tv9);

        newsAgency.notifySubscribers("ISRO's Chandrayan-3 landed successfully on the Moon!!");
        weatherStation.notifySubscribers(101.12);

        newsAgency.notifySubscribers("New Aircraft from Israel");
        weatherStation.notifySubscribers(100);
    }
}
