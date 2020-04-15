package com.company.carapp;

import com.company.carapp.model.Car;
import com.company.carapp.model.Engine;
import com.company.carapp.model.Gearbox;
import com.company.carapp.model.IgnitionLock;
import com.company.carapp.model.Wheels;
import com.company.carapp.model.pedals.BrakeCarPedal;
import com.company.carapp.model.pedals.GasCarPedal;
import com.company.carapp.states.CarIsOffState;
import com.company.carapp.states.CarState;

public class MainApp {

    public static void main(String[] args) {
        Car car = getCar();

        car.getState().printStatus();

        car.getState().insertKey(car);
        car.getState().turnKey(car);
        car.getState().printStatus();

        car.getState().putCarInDrive(car);
        car.getState().pressGas(car);
        car.getState().printStatus();

        car.getState().steerLeft(car);
        car.getState().printStatus();

        car.getState().steerStraight(car);
        car.getState().pressGas(car);
        car.getState().printStatus();

        car.getState().putCarInPark(car);

        car.getState().releaseGas(car);
        car.getState().pressBrake(car);
        car.getState().printStatus();

        car.getState().putCarInPark(car);
        car.getState().printStatus();
    }

    private static Car getCar() {
        CarState state = new CarIsOffState();
        Engine engine = new Engine();
        IgnitionLock ignitionLock = new IgnitionLock(engine);
        Wheels wheels = new Wheels(ignitionLock);
        Gearbox gearbox = new Gearbox(engine);
        return Car.builder()
            .state(state)
            .engine(engine)
            .wheels(wheels)
            .gearbox(gearbox)
            .brakePedal(new BrakeCarPedal())
            .gasPedal(new GasCarPedal())
            .ignitionLock(ignitionLock)
            .build();
    }

}
