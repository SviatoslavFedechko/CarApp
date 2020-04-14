package com.company.carapp;

import com.company.carapp.model.Car;
import com.company.carapp.model.Engine;
import com.company.carapp.model.IgnitionLock;

public class MainApp {

    public static void main(String[] args) {
        Engine engine = new Engine();
        IgnitionLock ignitionLock = new IgnitionLock(engine);
        Car car = Car.builder()
            .engine(engine)
            .ignitionLock(ignitionLock)
            .build();
        car.insertKey();
        car.turnKey();
        car.turnKey();
        car.removeKey();

    }

}
